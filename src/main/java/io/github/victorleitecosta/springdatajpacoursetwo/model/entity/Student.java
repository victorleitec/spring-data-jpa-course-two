package io.github.victorleitecosta.springdatajpacoursetwo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = SEQUENCE, generator = "student_sequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "day_of_birth")
    private LocalDate dayOfBirth;

    @Column(name = "age")
    @Transient
    private Integer age;

    public Integer getAge() {
        return Period.between(this.dayOfBirth, now()).getYears();
    }
}

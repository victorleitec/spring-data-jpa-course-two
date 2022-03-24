package io.github.victorleitecosta.springdatajpacoursetwo;

import io.github.victorleitecosta.springdatajpacoursetwo.model.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@SpringBootApplication
public class SpringDataJpaCourseTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaCourseTwoApplication.class, args);
    }
}

package io.github.victorleitecosta.springdatajpacoursetwo.config;

import io.github.victorleitecosta.springdatajpacoursetwo.model.entity.Student;
import io.github.victorleitecosta.springdatajpacoursetwo.model.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student fulano = Student.builder().name("Fulano").email("fulano@email.com").dayOfBirth(LocalDate.of(2000, JANUARY, 5)).build();
            Student cicrano = Student.builder().name("Cicrano").email("cicrano@email.com").dayOfBirth(LocalDate.of(2001, JANUARY, 5)).build();
            repository.saveAll(List.of(fulano, cicrano));
        };
    }
}

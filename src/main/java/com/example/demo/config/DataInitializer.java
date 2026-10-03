package com.example.demo.config;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            repository.save(new Employee("Alex", "Morgan", "alex.morgan@example.com", 75000.0));
            repository.save(new Employee("David", "Kim", "david.kim@example.com", 82000.0));
            repository.save(new Employee("Sara", "Connor", "sara.connor@example.com", 91000.0));
        };
    }
}
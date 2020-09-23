package com.example.mop.repository;

import com.example.mop.models.Expense;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(ExpenseRepository eRepository) {
        return args -> {
            eRepository.save(new Expense("Games", 20f));
            eRepository.save(new Expense("Supplies", 150f));
        };
    }
}

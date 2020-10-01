package com.example.mop.repository;

import com.example.mop.models.Expense;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(ExpenseRepository expenseRepository) {
        expenseRepository.save(new Expense("CATEGORY.GAMES"));
        expenseRepository.save(new Expense("CATEGORY.SUPPLIES"));

        return args -> {
        };
    }
}

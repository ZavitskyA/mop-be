package com.example.mop.controllers;

import com.example.mop.models.Expense;
import com.example.mop.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {
    @Autowired
    ExpenseRepository repository;

    @GetMapping("/expenses")
    public Expense[] expenseList() {
        return repository.findAll().toArray(new Expense[0]);
    }

    @PostMapping("/expense")
    Expense newExpense(@RequestBody Expense newExpense) {
        return repository.save(newExpense);
    }
}

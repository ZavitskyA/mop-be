package com.example.mop.controllers;

import com.example.mop.models.Expense;
import com.example.mop.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class ExpenseListController {
    @Autowired
    ExpenseRepository repository;

    @GetMapping(value = "/expenseList", produces = APPLICATION_JSON_VALUE)
    Expense[] expenseList() {
        return repository.findAll().toArray(new Expense[0]);
    }

    @PostMapping(value = "/expense", produces = APPLICATION_JSON_VALUE)
    Expense newExpense(@RequestBody Expense newExpense) {
        return repository.save(newExpense);
    }
}

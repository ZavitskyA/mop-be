package com.example.mop.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Expense {
    @Id
    @GeneratedValue
    private Long id;

    private String label;
    private Float price;

    public Expense(String label, Float price) {
        this.label = label;
        this.price = price;
    }

    public Expense() {

    }
}

package com.example.mop.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "label")
    private String label;

    public Expense(String label) {
        this.label = label;
    }

    public Expense() {
    }
}

package com.example.Task.Silver.BE.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "app_task")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    private String image;

    private String description;

    @ManyToOne
    @JoinColumn(name = "service_id",  nullable=false)
    private Service service;

    @OneToMany(mappedBy = "task")
    private List<Contract> contracts = new ArrayList<>();
    @OneToOne(mappedBy = "task")
    private Rating rating;
}

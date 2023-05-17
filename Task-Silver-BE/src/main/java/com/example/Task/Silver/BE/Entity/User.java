package com.example.Task.Silver.BE.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "app_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Account userAccount;

    private String avatar;

    private String name;

    private String phone;

    private String address;

    private String gender;

    private String creditCard;

    private String role;

    private BigDecimal ratePoint;

    private String description;

    private BigDecimal price;

    private Integer totalTask;
    private Integer doneTask;

    @OneToMany(mappedBy = "client")
    private List<Contract> contractsAsClient = new ArrayList<>();

    @OneToMany(mappedBy = "employee")
    private List<Contract> contractsAsEmployee = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "user_task",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "task_id"))
    private List<Task> tasks = new ArrayList<>();

    // getters and setters
}


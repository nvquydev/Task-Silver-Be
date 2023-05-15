package com.example.Task.Silver.BE.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "app_contract")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private User employee;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private BigDecimal pay;

    private Boolean status;
}

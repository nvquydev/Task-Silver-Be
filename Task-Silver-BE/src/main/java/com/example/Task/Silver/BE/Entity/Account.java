package com.example.Task.Silver.BE.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "app_account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    private Long accountId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    private String username;

    private String password;

}

package com.example.Task.Silver.BE.Response;

import com.example.Task.Silver.BE.Entity.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private String fullName;
    private  Long userID;
}
package com.example.Task.Silver.BE.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private Long accountId;
    private Long userId;
    private String username;
    private String password;
}
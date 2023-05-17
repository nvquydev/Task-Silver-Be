package com.example.Task.Silver.BE.Service;

import com.example.Task.Silver.BE.Entity.Account;
import com.example.Task.Silver.BE.Request.LoginRequest;
import com.example.Task.Silver.BE.Response.LoginResponse;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public interface AccountService {
    LoginResponse getAccountByUserNameAndPassword(LoginRequest loginRequest) throws ParseException;
}

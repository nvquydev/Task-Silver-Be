package com.example.Task.Silver.BE.Service;

import com.example.Task.Silver.BE.Entity.Account;
import com.example.Task.Silver.BE.Repository.AccountRepository;
import com.example.Task.Silver.BE.Request.LoginRequest;
import com.example.Task.Silver.BE.Response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;

public class AccountServiceImpl implements  AccountService{
    @Autowired
    AccountRepository accountRepository;
    @Override
    public LoginResponse getAccountByUserNameAndPassword(LoginRequest loginRequest) throws ParseException {

        Account account =  accountRepository.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        return new LoginResponse(account.getUser().getName(),account.getUser().getUserId());
    }

}

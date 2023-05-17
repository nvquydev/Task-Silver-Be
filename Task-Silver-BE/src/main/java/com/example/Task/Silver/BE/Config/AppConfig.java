package com.example.Task.Silver.BE.Config;

import com.example.Task.Silver.BE.Service.AccountService;
import com.example.Task.Silver.BE.Service.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AccountService accountService() {
        return new AccountServiceImpl();
    }
}
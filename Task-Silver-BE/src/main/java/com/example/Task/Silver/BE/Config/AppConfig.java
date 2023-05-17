package com.example.Task.Silver.BE.Config;

import com.example.Task.Silver.BE.Service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AccountService accountService() {
        return new AccountServiceImpl();
    }

    @Bean
    public AppService appService() {
        return new AppServiceImpl();
    }

    @Bean
    public TaskService taskService() {
        return new TaskServiceImpl();
    }
}
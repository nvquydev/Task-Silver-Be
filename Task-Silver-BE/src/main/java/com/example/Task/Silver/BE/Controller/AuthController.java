package com.example.Task.Silver.BE.Controller;


import com.example.Task.Silver.BE.Entity.Account;
import com.example.Task.Silver.BE.Entity.User;
import com.example.Task.Silver.BE.Repository.AccountRepository;
import com.example.Task.Silver.BE.Repository.UserRepository;
import com.example.Task.Silver.BE.Request.LoginRequest;
import com.example.Task.Silver.BE.Response.LoginResponse;
import com.example.Task.Silver.BE.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    AccountService accountService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) throws ParseException {
        // Thực hiện xác thực thông tin đăng nhập
        LoginResponse loginResponse = accountService.getAccountByUserNameAndPassword(loginRequest);
        if (loginResponse == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Sai tài khoản hoặc mật khẩu");
        }
        return ResponseEntity.status(HttpStatus.OK).body(loginResponse);

    }
}

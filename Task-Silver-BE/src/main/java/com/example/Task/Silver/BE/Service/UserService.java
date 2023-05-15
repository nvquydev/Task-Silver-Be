package com.example.Task.Silver.BE.Service;

import com.example.Task.Silver.BE.Dto.UserDto;

public interface UserService {
    UserDto getUserByUsername(String username);
    boolean authenticate(String username, String password);
}
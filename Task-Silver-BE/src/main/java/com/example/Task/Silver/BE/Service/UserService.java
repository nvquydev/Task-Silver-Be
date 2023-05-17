package com.example.Task.Silver.BE.Service;

import com.example.Task.Silver.BE.Entity.User;

import java.util.List;

public interface UserService {

     User createUser(User user) ;
     User getUserById(Long userId) ;

     List<User> getAllUsers() ;
     User updateUser(User user) ;
     void deleteUser(Long userId) ;
}

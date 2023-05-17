package com.example.Task.Silver.BE.Repository;

import com.example.Task.Silver.BE.Entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByUsernameAndPassword(String username, String password);



}
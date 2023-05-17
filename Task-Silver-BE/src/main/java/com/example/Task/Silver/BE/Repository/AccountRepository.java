package com.example.Task.Silver.BE.Repository;

import com.example.Task.Silver.BE.Entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {


    Account findAccountByUsername(String userName);

    Account findAccountByUsernameAndPassword(String userName, String passWord);
    Account findByUsernameAndPassword(String username, String password);



}
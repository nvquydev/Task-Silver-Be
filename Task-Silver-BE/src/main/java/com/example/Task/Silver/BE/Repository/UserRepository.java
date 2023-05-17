package com.example.Task.Silver.BE.Repository;

import com.example.Task.Silver.BE.Entity.Account;
import com.example.Task.Silver.BE.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories(basePackages = "jdbc:sqlserver://localhost:1433;databaseName=SilverTask")
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUserAccount (Account account);

}


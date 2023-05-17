package com.example.Task.Silver.BE.Repository;

import com.example.Task.Silver.BE.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findTasksByUsers_UserId(Long userId);



}

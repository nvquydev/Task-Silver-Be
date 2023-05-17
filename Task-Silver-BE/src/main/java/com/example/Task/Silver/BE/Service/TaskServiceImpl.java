package com.example.Task.Silver.BE.Service;

import com.example.Task.Silver.BE.Entity.Task;
import com.example.Task.Silver.BE.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskServiceImpl implements TaskService{
    @Autowired
    TaskRepository taskRepository;
    @Override
    public List<Task> findAllTaskByUserId(Long id) {
        List<Task> tasks = taskRepository.findTasksByUsers_UserId(id);
        return tasks;
    }
}

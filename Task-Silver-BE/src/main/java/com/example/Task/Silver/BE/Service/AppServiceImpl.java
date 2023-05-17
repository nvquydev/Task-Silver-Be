package com.example.Task.Silver.BE.Service;

import com.example.Task.Silver.BE.Entity.Task;
import com.example.Task.Silver.BE.Repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppServiceImpl implements AppService{
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public List<Task> getTasksByServiceId(Long id) {
        List<Task> tasks =  serviceRepository.findTasksById(id);
        return tasks;
    }
}

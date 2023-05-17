package com.example.Task.Silver.BE.Service;

import com.example.Task.Silver.BE.Entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppService {
    List<Task> getTasksByServiceId(Long id);
}

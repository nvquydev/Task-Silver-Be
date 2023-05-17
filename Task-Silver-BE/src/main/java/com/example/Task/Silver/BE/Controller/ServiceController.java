package com.example.Task.Silver.BE.Controller;

import com.example.Task.Silver.BE.Entity.Task;
import com.example.Task.Silver.BE.Service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/service")
public class ServiceController {
    @Autowired
    AppService appService;


    @GetMapping("/{serviceId}/tasks")
    public  ResponseEntity<List<Task>> getTasksByServiceId(@PathVariable Long serviceId){
        List<Task> tasks = appService.getTasksByServiceId(serviceId);
        return new ResponseEntity<>(tasks, HttpStatus.OK);

    }

}

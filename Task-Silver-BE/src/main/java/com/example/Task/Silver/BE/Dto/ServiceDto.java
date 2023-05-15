package com.example.Task.Silver.BE.Dto;

import com.example.Task.Silver.BE.Entity.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDto {
    private Long id;
    private String name;
    private String description;
    private String image;
    private List<Task> tasks = new ArrayList<>();
}

package com.example.Task.Silver.BE.Dto;

import com.example.Task.Silver.BE.Entity.Contract;
import com.example.Task.Silver.BE.Entity.Rating;
import com.example.Task.Silver.BE.Entity.Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    private Long id;
    private String name;
    private double price;
    private String image;
    private String description;
    private Service service;

    private List<Contract> contracts = new ArrayList<>();

    private Rating rating;
}


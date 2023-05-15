package com.example.Task.Silver.BE.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractDto {
    private Long id;
    private Long clientId;
    private Long employeeId;
    private String activity;
    private String startTime;
    private String endTime;
    private double pay;
    private boolean status;
}
package com.example.Task.Silver.BE.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long userId;
    private String avatar;
    private String name;
    private String phone;
    private String address;
    private String gender;
    private String creditCard;
    private String role;
    private String description;
    private BigDecimal price;
    private Integer totalTask;
    private Integer doneTask;
}

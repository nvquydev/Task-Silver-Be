package com.example.Task.Silver.BE.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatingDto {
    private Long id;
    private Long taskId;
    private int star;
    private String comment;
    private LocalDateTime time;
}

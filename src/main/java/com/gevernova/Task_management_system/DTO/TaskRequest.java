package com.gevernova.Task_management_system.DTO;

import lombok.Data;

@Data
public class TaskRequest {
    private String title;
    private String description;
    private Long userId;
    private Long categoryId;
    private Long priorityId;
}
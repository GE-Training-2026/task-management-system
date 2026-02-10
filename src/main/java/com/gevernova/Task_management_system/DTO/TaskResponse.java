package com.gevernova.Task_management_system.DTO;

import lombok.Data;

@Data
public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private String status;

    private UserDTO user;
    private CategoryDTO category;
    private PriorityDTO priority;
}

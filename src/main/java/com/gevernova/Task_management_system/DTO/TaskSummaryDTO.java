package com.gevernova.Task_management_system.DTO;
import lombok.Data;

@Data
public class TaskSummaryDTO {
    private Long id;
    private String title;
    private String status;
    private String priority;
}


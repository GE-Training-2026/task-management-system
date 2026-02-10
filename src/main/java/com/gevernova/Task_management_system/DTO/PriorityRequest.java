package com.gevernova.Task_management_system.DTO;
import lombok.Data;

@Data
public class PriorityRequest {
    private String level; // HIGH, MEDIUM, LOW (if you want enum later)
}

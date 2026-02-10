package com.gevernova.Task_management_system.repository;

import com.gevernova.Task_management_system.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {}
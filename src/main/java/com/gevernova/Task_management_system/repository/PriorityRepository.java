package com.gevernova.Task_management_system.repository;

import com.gevernova.Task_management_system.model.Priority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityRepository extends JpaRepository<Priority, Long> {}
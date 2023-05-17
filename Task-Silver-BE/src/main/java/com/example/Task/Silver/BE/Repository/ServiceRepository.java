package com.example.Task.Silver.BE.Repository;

import com.example.Task.Silver.BE.Entity.Service;
import com.example.Task.Silver.BE.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Task> findTasksById(Long serviceId);
}

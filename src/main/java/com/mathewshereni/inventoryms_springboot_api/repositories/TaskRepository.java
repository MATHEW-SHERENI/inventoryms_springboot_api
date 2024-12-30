package com.mathewshereni.inventoryms_springboot_api.repositories;


import com.mathewshereni.inventoryms_springboot_api.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}

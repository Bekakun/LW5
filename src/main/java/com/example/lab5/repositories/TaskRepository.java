package com.example.lab5.repositories;

import com.example.lab5.models.Task;
import com.example.lab5.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(UserModel user);
}
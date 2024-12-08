package com.example.lab5.services;

import com.example.lab5.models.Category;
import com.example.lab5.models.Task;
import com.example.lab5.models.UserModel;
import com.example.lab5.repositories.CategoryRepository;
import com.example.lab5.repositories.TaskRepository;
import com.example.lab5.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Task> getTasksByUser(String username) {
        UserModel user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
        return taskRepository.findByUser(user);
    }

    public Task addTask(String username, Task task, Long categoryId) {
        UserModel user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
        task.setUser(user);

        if (categoryId != null) {
            Category category = categoryRepository.findById(categoryId).orElseThrow(() -> new RuntimeException("Category not found"));
            task.setCategory(category);
        }

        return taskRepository.save(task);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
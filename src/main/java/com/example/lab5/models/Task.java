package com.example.lab5.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long task_id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "due_date", nullable = false)
    private Date due_date;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "priority", nullable = false)
    private int priority;
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private User user_id;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category_id;
    @ManyToOne
    private User user;

    public Task() {}
    public Task(String title, String description, Date due_date, String status, int priority, User user_id, Category category_id) {
        this.title = title;
        this.description = description;
        this.due_date = due_date;
        this.status = status;
        this.priority = priority;
        this.user_id = user_id;
        this.category_id = category_id;
    }

    public Long getTask_id() {
        return task_id;
    }
    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDue_date() {
        return due_date;
    }
    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public User getUser_id() {
        return user_id;
    }
    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Category getCategory_id() {
        return category_id;
    }
    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }
}

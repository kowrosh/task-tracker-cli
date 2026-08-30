package org.example;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(int id) {
        super("Task with ID " + id + " not found.");
    }
}

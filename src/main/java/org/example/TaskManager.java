package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String description){
        Task task = new Task(nextId, description);
        tasks.add(task);
        nextId++;
    }
    public List<Task> getAllTasks(){
        return tasks;

    }
    public Task findTaskById(int id){
        for(Task task : tasks){
            if(task.getId() == id){
                return task;
            }
        }
        return null;
    }
    public void updateTask(int id, String description){
        Task task = findTaskById(id);
        if(task != null){
            task.setDescription(description);
        }
    }
    public void deleteTask(int id) {
        boolean removed = tasks.removeIf(task -> task.getId() == id);

        if (!removed) {
            System.out.println("Task with ID " + id + " not found.");
        }
    }
}

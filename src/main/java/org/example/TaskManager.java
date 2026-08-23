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
}

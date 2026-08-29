package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.nextId = 1;
    }

    public TaskManager(List<Task> tasks) {
        this.tasks = tasks;

        int maxId = 0;

        for (Task task : tasks) {
            if (task.getId() > maxId) {
                maxId = task.getId();
            }
        }

        this.nextId = maxId + 1;
    }
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
    public void markInProgress(int id){
        Task task =findTaskById(id);
        if(task != null){
            task.setStatus(TaskStatus.IN_PROGRESS);
        }
    }
    public void markDone(int id){
        Task task = findTaskById(id);
        if(task != null){
            task.setStatus(TaskStatus.DONE);
        }
    }

    public List<Task> getTasksByStatus(TaskStatus status) {
        List<Task> filteredTasks = new ArrayList<>();

        for (Task task : this.tasks) {
            if (task.getStatus() == status) {
                filteredTasks.add(task);
            }
        }

        return filteredTasks;
    }

}

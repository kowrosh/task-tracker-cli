package org.example;

public class Main {
    public static void main(String[] args) throws Exception {

        TaskManager taskManager = new TaskManager();
        taskManager.addTask("learning");
        taskManager.addTask("Gaming");
        taskManager.addTask("coding");
        for(Task task : taskManager.getAllTasks()){
            System.out.println(task);
        }
    }
}
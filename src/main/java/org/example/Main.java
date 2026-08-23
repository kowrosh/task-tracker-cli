package org.example;

public class Main {
    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();

        manager.addTask("Learning");
        manager.addTask("Gaming");
        manager.addTask("Coding");

        manager.updateTask(2, "Play Minecraft");
        manager.deleteTask(1);

        for (Task task : manager.getAllTasks()) {
            System.out.println(task);
        }
    }
}
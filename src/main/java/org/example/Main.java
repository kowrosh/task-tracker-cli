package org.example;

public class Main {
    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();

        manager.addTask("Java");
        manager.addTask("Gaming");
        manager.addTask("Coding");

        manager.markDone(1);
        manager.markInProgress(2);

        System.out.println(manager.getTasksByStatus(TaskStatus.DONE));
        System.out.println(manager.getTasksByStatus(TaskStatus.IN_PROGRESS));
        System.out.println(manager.getTasksByStatus(TaskStatus.TODO));
}}
package org.example;

public class Main {
    public static void main(String[] args) throws Exception {

        Task task = new Task(1, "Learn Java");

        System.out.println(task);

        Thread.sleep(1000);

        task.setDescription("Learn Java Collections");

        System.out.println(task);

        task.setStatus(TaskStatus.IN_PROGRESS);

        System.out.println(task);
    }
}
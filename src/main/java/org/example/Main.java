package org.example;

public class Main {
    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();

        if (args.length > 0) {
            switch (args[0]) {
                case "add":
                    if (args.length > 1) {
                        manager.addTask(args[1]);
                    }
                    break;
                case "list":
                    if (args.length == 1) {
                        for (Task task : manager.getAllTasks()) {
                            System.out.println(task);
                        }
                    } else {
                        switch (args[1]) {
                            case "done":
                                for (Task task : manager.getTasksByStatus(TaskStatus.DONE)) {
                                    System.out.println(task);
                                }
                                break;

                            case "todo":
                                for (Task task : manager.getTasksByStatus(TaskStatus.TODO)) {
                                    System.out.println(task);
                                }
                                break;

                            case "in-progress":
                                for (Task task : manager.getTasksByStatus(TaskStatus.IN_PROGRESS)) {
                                    System.out.println(task);
                                }
                                break;
                        }
                    }
                    break;
                case "update":
                    if (args.length > 2) {
                        manager.updateTask(Integer.parseInt(args[1]), args[2]);
                    }
                    break;
                    case "delete":
                        if (args.length > 1) {
                        manager.deleteTask(Integer.parseInt(args[1]));
                        }
                        break;

                case "mark-done":
                    if (args.length > 1) {
                        manager.markDone(Integer.parseInt(args[1]));
                    }
                    break;
                case "mark-in-progress":
                    if (args.length > 1) {
                        manager.markInProgress(Integer.parseInt(args[1]));
                    }
                    break;
            }



        }

}}

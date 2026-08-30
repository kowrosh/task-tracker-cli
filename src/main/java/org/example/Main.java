package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        TaskFileStorage storage = new TaskFileStorage();

        List<Task> loadedTasks = storage.loadTasks();

        TaskManager manager = new TaskManager(loadedTasks);

        try {

            if (args.length > 0) {

                switch (args[0]) {

                    case "add":
                        if (args.length < 2) {
                            System.out.println("Usage: add \"description\"");
                            break;
                        }

                        manager.addTask(args[1]);
                        break;


                    case "list":
                        if (args.length == 1) {

                            for (Task task : manager.getAllTasks()) {
                                System.out.println(task);
                            }

                        } else {

                            switch (args[1]) {

                                case "done":
                                    for (Task task :
                                            manager.getTasksByStatus(TaskStatus.DONE)) {
                                        System.out.println(task);
                                    }
                                    break;

                                case "todo":
                                    for (Task task :
                                            manager.getTasksByStatus(TaskStatus.TODO)) {
                                        System.out.println(task);
                                    }
                                    break;

                                case "in-progress":
                                    for (Task task :
                                            manager.getTasksByStatus(TaskStatus.IN_PROGRESS)) {
                                        System.out.println(task);
                                    }
                                    break;

                                default:
                                    System.out.println(
                                            "Usage: list [todo|in-progress|done]"
                                    );
                                    break;
                            }
                        }
                        break;


                    case "update":
                        if (args.length < 3) {
                            System.out.println(
                                    "Usage: update <id> \"description\""
                            );
                            break;
                        }

                        manager.updateTask(
                                Integer.parseInt(args[1]),
                                args[2]
                        );
                        break;


                    case "delete":
                        if (args.length < 2) {
                            System.out.println("Usage: delete <id>");
                            break;
                        }

                        manager.deleteTask(
                                Integer.parseInt(args[1])
                        );
                        break;


                    case "mark-done":
                        if (args.length < 2) {
                            System.out.println("Usage: mark-done <id>");
                            break;
                        }

                        manager.markDone(
                                Integer.parseInt(args[1])
                        );
                        break;


                    case "mark-in-progress":
                        if (args.length < 2) {
                            System.out.println(
                                    "Usage: mark-in-progress <id>"
                            );
                            break;
                        }

                        manager.markInProgress(
                                Integer.parseInt(args[1])
                        );
                        break;


                    default:
                        System.out.println("Unknown command.");
                        break;
                }
            }

        } catch (TaskNotFoundException e) {

            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {

            System.out.println("ID must be a number.");
        }

        storage.saveTasks(manager.getAllTasks());
    }
}
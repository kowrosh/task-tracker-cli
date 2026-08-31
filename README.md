https://roadmap.sh/projects/task-tracker
# Task Tracker CLI

A command-line task manager built with Java.

The application allows users to create, update, delete, and track tasks directly from the command line. Tasks are persisted in a JSON file so they remain available between program runs.

## Features

- Add new tasks
- Update task descriptions
- Delete tasks
- Mark tasks as in progress
- Mark tasks as done
- List all tasks
- Filter tasks by status
- Store tasks in JSON
- Automatically restore saved tasks
- Handle invalid commands and IDs

## Technologies

- Java 20
- Maven
- Jackson
- Jackson Java Time Module

## Task Model

Each task contains:

- `id`
- `description`
- `status`
- `createdAt`
- `updatedAt`

Available statuses:

```text
TODO
IN_PROGRESS
DONE

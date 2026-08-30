# Task Tracker CLI

A command-line task manager built with Java.

## Features

- Add tasks
- Update task descriptions
- Delete tasks
- Mark tasks as in progress or done
- List all tasks
- Filter tasks by status
- JSON persistence between program runs
- Error handling for invalid IDs and commands

## Tech Stack

- Java 20
- Maven
- Jackson
- Jackson Java Time Module

## Commands

| Command | Description |
| --- | --- |
| `add "description"` | Add a task |
| `update <id> "description"` | Update a task |
| `delete <id>` | Delete a task |
| `mark-in-progress <id>` | Mark task as in progress |
| `mark-done <id>` | Mark task as done |
| `list` | List all tasks |
| `list todo` | List TODO tasks |
| `list in-progress` | List in-progress tasks |
| `list done` | List completed tasks |

## Persistence

Tasks are stored in `tasks.json`.

Each task contains:

- `id`
- `description`
- `status`
- `createdAt`
- `updatedAt`

Available statuses:

- `TODO`
- `IN_PROGRESS`
- `DONE`

## Build

```bash
mvn clean package

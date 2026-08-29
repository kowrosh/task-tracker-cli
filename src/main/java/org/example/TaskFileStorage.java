package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskFileStorage {

    private final ObjectMapper mapper;
    private static final String FILE_NAME = "tasks.json";

    public TaskFileStorage() {
        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
    }

    public void saveTasks(List<Task> tasks) throws IOException {
        mapper.writeValue(new File(FILE_NAME), tasks);
    }

    public List<Task> loadTasks() throws IOException {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        return mapper.readValue(
                file,
                new TypeReference<List<Task>>() {}
        );
    }
}
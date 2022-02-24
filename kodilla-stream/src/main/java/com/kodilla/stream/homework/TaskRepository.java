package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Move to Berlin", LocalDate.of(2021, 04, 01), LocalDate.of(2022, 02, 20)));
        tasks.add(new Task("Buy a car", LocalDate.of(2022, 01, 01), LocalDate.of(2023, 01, 20)));
        tasks.add(new Task("Buy a dog", LocalDate.of(2019, 03, 01), LocalDate.of(2020, 01, 15)));
        tasks.add(new Task("Write a book", LocalDate.of(2022, 02, 01), LocalDate.of(2024, 06, 10)));
        return tasks;
    }
}



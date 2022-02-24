package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> tasks = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadLine().isAfter(LocalDate.of(2022,02,24)))
                .map(TaskManager::getDeadLine)
                .collect(Collectors.toList());
        System.out.println(tasks);
    }
        public static LocalDate getDeadLine(Task task) {
        return task.getDeadLine();
        }

}

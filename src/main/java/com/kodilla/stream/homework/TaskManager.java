package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadline = TaskRepository.getTasks()
                .stream()
                .filter(t -> t.getDeadline())
                .map(TaskManager::getName)
                .collect(Collectors.toList());
        System.out.println(deadline);
    }
    public static String getName (Task task){
        return task.getName();
    }
}

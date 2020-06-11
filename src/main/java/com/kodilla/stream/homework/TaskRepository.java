package com.kodilla.stream.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("clean room",));
        tasks.add(new Task("call grandpa",));
        tasks.add(new Task("do homework",));
        return tasks;
    }

}

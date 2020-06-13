package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        LocalDate date1 = LocalDate.of(2020, 6, 3);
        LocalDate date2 = LocalDate.of(2020, 6,16);
        LocalDate date3 = LocalDate.of(2020,6,15);

        LocalDate currentDate = LocalDate.now();

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("clean room",date1, currentDate));
        tasks.add(new Task("call grandpa",date2, date2));
        tasks.add(new Task("do homework",date3,date2));
        return tasks;
    }

}

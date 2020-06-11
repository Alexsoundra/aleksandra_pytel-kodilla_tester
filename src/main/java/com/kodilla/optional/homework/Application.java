package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Mark", null));
        students.add(new Student("Nick", null));
        students.add(new Student("Adeline", Dowell));
        students.add(new Student("Jane", McKeyn));

        for (Student student : students){
            Optional<List<Student>> optionalStudent = Optional.ofNullable(students);

            Teacher teacher = optionalStudent.orElse()
        }
    }
}

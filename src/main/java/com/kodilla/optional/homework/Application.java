package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("McDowell");
        Teacher teacher2 = new Teacher("Mr. Q");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Mark", null));
        students.add(new Student("Nick", null));
        students.add(new Student("Adeline", teacher1));
        students.add(new Student("Jane", teacher2));

        for (Student student : students){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(students);
            String teacherName = optionalTeacher.orElse(new Student("", null)).getName();
        System.out.println(teacherName + "undefined");
            
        }
    }
}

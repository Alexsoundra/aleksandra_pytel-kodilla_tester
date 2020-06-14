package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double average40 = UserRepository.getUsersList()
                .stream()
                .filter(t -> t.getAge()>=40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(average40);


        double averageUnder40 = UserRepository.getUsersList()
                .stream()
                .filter(t -> t.getAge()<40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(averageUnder40);
    }
}

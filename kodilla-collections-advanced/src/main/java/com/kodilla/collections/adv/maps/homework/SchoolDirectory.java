package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal mr1 = new Principal("Mr.McDowell","Highschool 1");
        Principal mr2 = new Principal("Mr.Mackenzie", "Grizzly Highschool");
        Principal mr3 = new Principal("Mr.Johnson", "Garden's Highschool");
        Principal mr4 = new Principal("Mr.Solveig", "90210 Highschool");

        School mr1School = new School(10,20,50);
        School mr2School = new School(43, 25,12);
        School mr3School = new School(16, 23, 36);
        School mr4School = new School(5, 10, 3);

        school.put(mr1, mr1School);
        school.put(mr2, mr2School);
        school.put(mr3,mr3School);
        school.put(mr4, mr4School);

        for ( Map.Entry<Principal, School> pricipalEntry : school.entrySet())
            System.out.println(pricipalEntry.getKey().getPrincipalName() + " is principal of school name: " + pricipalEntry.getKey().getSchoolName() + " and number of students at school: " + pricipalEntry.getValue().getNumberOfStudents());
    }
    }


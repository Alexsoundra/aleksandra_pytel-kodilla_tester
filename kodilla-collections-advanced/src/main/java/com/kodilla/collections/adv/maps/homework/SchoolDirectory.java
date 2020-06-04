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

        School mr1School = new School(10.0,20.0,50.0);
        School mr2School = new School(43.0, 25.0,12.0);
        School mr3School = new School(16.0, 23.0, 36.0);
        School mr4School = new School(5.0, 10.0, 3.0);

        school.put(mr1, mr1School);
        school.put(mr2, mr2School);
        school.put(mr3,mr3School);
        school.put(mr4, mr4School);

        for ( Map.Entry<Principal, School> pricipalEntry : school.entrySet())
            System.out.println(pricipalEntry.getKey().getPrincipalName() + pricipalEntry.getKey().getSchoolName() + ", numbers of students at school: " + pricipalEntry.getValue().getNumberOfStudents());
    }
    }


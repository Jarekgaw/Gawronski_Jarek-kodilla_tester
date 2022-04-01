package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> students = new ArrayList<>();

    public School(int ... students) {
        for (int student : students)
            this.students.add(student);
    }

    @Override
    public String toString() {
        return "School" + students.toString();
    }

}

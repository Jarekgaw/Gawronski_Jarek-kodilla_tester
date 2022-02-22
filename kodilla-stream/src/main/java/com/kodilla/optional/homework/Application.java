package com.kodilla.optional.homework;

import com.kodilla.optional.OptionalExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam", null));
        students.add(new Student("Marek", new Teacher("Kowalska")));
        students.add(new Student("Piotr", new Teacher("Nowak")));
        students.add(new Student("Marta", new Teacher("Nowicka")));
        students.add(new Student("Jarek", new Teacher("Markiewicz")));

        for (Student student : students) {

            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.teacher);
            Teacher teacher = Optional.ofNullable(student.getTeacher()).orElse(new Teacher("undefined"));
            System.out.println("Student: " + student.getName() + " Teacher: " + teacher.getName());
        }
    }
}

package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int roll_no;
    static String scholl_name = "Sadhana High School Degloor";

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

   public void display() {
        System.out.println(name + " " + roll_no + " " + scholl_name);
    }

    public static void main(String[] args) {
        Student s = new Student("Aditya", 12);
        Student s1 = new Student("Suraj", 13);
        s.display();
        s1.display();
        //Collection to print Different Way
        List<Student> students = new ArrayList<>();
        students.add(s);
        students.add(s1);
        System.out.println(students);
    }
}

package com.bridgelabz;

public class Project {
    String name;
    int id;
    static String company = "Wipro";

    public Project(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void display(){
        System.out.println(name+" "+id+" "+company);
    }

    public static void main(String[] args) {
        Project project = new Project("Aditya",24);
        Project project1 = new Project("Sanket",25);
        Project project2 = new Project("Suraj",12);
        project.display();
        project1.display();
        project2.display();
    }
}

package com.bridgelabz;

public class ProjectDemo {
    private String name;
    private int id;
    private String company;

    public ProjectDemo(String name, int id, String company) {
        this.name = name;
        this.id = id;
        this.company = company;
    }
    @Override
    public String toString() {
        return "ProjectDemo{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ProjectDemo p[]= new ProjectDemo[3];
        p[0]=new ProjectDemo("Aditya",1,"Bridge");
        p[1]=new ProjectDemo("Suraj",2,"Bridge");
        p[2]=new ProjectDemo("Ram",3,"Voyms");
        for (int i=0;i< p.length;i++){
            System.out.println(p[i]);
        }
    }
}


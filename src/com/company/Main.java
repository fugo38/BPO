package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Student{

    private static ArrayList<Student> alleStudenten = new ArrayList<>();
    private String naam;
    private static int studentNummerId = 20220317;
    private int nummer;

    public Student(String naam) {

        this.naam = naam;
        this.nummer = uniekNummer();
    }

    public String getNaam() {
        return naam;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public static ArrayList<Student> addStudent() {
        alleStudenten.add(new Student("Mehmet"));
        alleStudenten.add(new Student("Turan"));
        alleStudenten.add(new Student("Furkan"));
        alleStudenten.add(new Student("Nazih"));
        return alleStudenten;
    }

    public void inloggen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wat is uw naam?");
        String username = sc.nextLine();
//        System.out.println("Wat is uw student nummer?");
//        int studentId = sc.nextInt();
        for (int i=0; i < addStudent().size(); i++) {
            if (alleStudenten.get(i).getNaam().equals(username)) {
                System.out.println("ingelogged");
            }
        }
    }

    private static Integer uniekNummer(){
        int nummer = studentNummerId;
        studentNummerId++;
        return nummer;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Mehmet");
        System.out.println(student1);
        student1.inloggen();

    }
}

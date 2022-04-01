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

    public Student inloggen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = scanner.nextLine();
        System.out.println("Enter your Student Number");
        int studentId = scanner.nextInt();
        if (username.equals(this.naam) && studentId == this.nummer) {
            answer = true;
            System.out.println("test");
        }
        alleStudenten.add(new Student("Mehmet"));
        return;
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

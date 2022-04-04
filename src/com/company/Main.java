package com.company;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Scanner;

class VraagAntwoord{
    private String vraag;
    private String antwoord;


    public VraagAntwoord(String vraag, String antwoord){
        this.vraag = vraag;
        this.antwoord = antwoord;
    }




    public String getVraag() {
        return vraag;
    }
    public String getAntwoord() {
        return antwoord;
    }

}

class Vraag{
    private final String vraag;
    private final String antwoord;
    public Vraag(String vraag, String antwoord) {
        this.vraag = vraag;
        this.antwoord = antwoord;
    }
    public String getVraag() {
        return vraag;
    }

    public String getAntwoord() {
        return antwoord;
    }
}

class Examen extends Main {
    private String examen;

    public Examen(String examen, ArrayList vragen) {
        this.examen = examen;
    }

    public String getExamen() {
        return examen;

    }

    public static void addRekenExamen() {
        rekenVragen.add(new Vraag("Vraag 1: wat is 5 + 5", "10"));
        rekenVragen.add(new Vraag("Vraag 2: wat is 5 + 12", "17"));
        rekenVragen.add(new Vraag("Vraag 3: wat is 51 + 5", "56"));
        rekenVragen.add(new Vraag("Vraag 4: wat is 75 + 54", "129"));
        rekenVragen.add(new Vraag("Vraag 5: wat is 53 + 50", "103"));
    }

    public static void rekenExamen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Je moet minimaal 3 vragen goed hebben voor een voldoende");
        String examen = "Rekenen";
        double cijfer = 0;
        for (int i = 0; i < rekenVragen.size(); i++) {
            System.out.println(rekenVragen.get(i).getVraag());
            String antwoord = scanner.next();
            if (rekenVragen.get(i).getVraag().equals(rekenVragen.get(i).getVraag()) && antwoord.equals(rekenVragen.get(i).getAntwoord())) {
                System.out.println("Goed antwoordt");
                cijfer = cijfer + 2;
            } else {
                System.out.println("Fout antwoordt");
            }
        }
        if (cijfer >= 5.5) {
            System.out.println("Student " + inlogNaam + " is geslaagd voor " + examen);
        } else {
            System.out.println("Student " + inlogNaam + " is gezakt voor " + examen);

        }
        System.out.println("Cijfer: " + cijfer);
        Cijfers.add(new Cijfer(inlogNaam, studentNummer, examen, cijfer));
    }

    public static void addWiskundeExamen() {
        wiskundeVragen.add(new Vraag("vraag1: wat is 10 + 5", "15"));
        wiskundeVragen.add(new Vraag("vraag2: wat is 5 + 112", "117"));
        wiskundeVragen.add(new Vraag("vraag3: wat is 51 + 5", "56"));
        wiskundeVragen.add(new Vraag("vraag4: wat is 75 + 54", "129"));
        wiskundeVragen.add(new Vraag("vraag5: wat is 53 + 50", "103"));
    }

    public static void wiskundeExamen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Je moet minimaal 3 vragen goed hebben voor een voldoende");
        String examen = "Wiskunde";
        double cijfer = 0;
        for (int i = 0; i < wiskundeVragen.size(); i++) {
            System.out.println(wiskundeVragen.get(i).getVraag());
            String antwoord = scanner.nextLine();
            if (wiskundeVragen.get(i).getVraag().equals(wiskundeVragen.get(i).getVraag()) && antwoord.equals(wiskundeVragen.get(i).getAntwoord())) {
                System.out.println("Goed antwoordt");
                cijfer = cijfer + 2;
            } else {
                System.out.println("Fout antwoordt");
            }
        }
        if (cijfer >= 5.5) {
            System.out.println("Student " + inlogNaam + " is geslaagd voor " + examen);
        } else {
            System.out.println("Student " + inlogNaam + " is gezakt voor " + examen);

        }
        System.out.println("Cijfer: " + cijfer);
        Cijfers.add(new Cijfer(inlogNaam, studentNummer, examen, cijfer));
    }

    public static void addExamenLijst() {
        Examens.add(new Examen("Rekenexamen", rekenVragen));
        Examens.add(new Examen("Wiskunde examen", wiskundeVragen));
    }

    public static void examenLijst() {

        for (int i = 0; i < Examens.size(); i++) {
            System.out.println(i + 1 + ". " + Examens.get(i).examen);
        }
    }
}

class Cijfer extends Main {
    private String naam;
    private int studentenNummer;
    private String examen;
    private double cijfer;


    public Cijfer(String naam, int studentenNummer, String examen, double cijfer) {
        this.naam = naam;
        this.studentenNummer = studentenNummer;
        this.examen = examen;
        this.cijfer = cijfer;
    }
    public static void printCijfers() {
        System.out.println(Cijfers);
    }

    public String getNaam() {
        return naam;
    }

    public int getStudentenNummer() {
        return studentenNummer;
    }

    public String getExamen() {
        return examen;
    }

    public double getCijfer() {
        return cijfer;
    }

    public String toString() {
        return naam + " | " + studentenNummer + " | " + examen + " | " + cijfer + "\n";

    }
}

class Student extends Main{

    private int GeslaagdAantal=0;
    private static ArrayList<Student> alleStudenten = new ArrayList<>();
    private String naam;
    private static int studentNummerId = 20220317;
    private int nummer;
    private Student ingelogdestudent;

    public Student(String naam) {

        this.naam = naam;
        this.nummer = uniekNummer();
    }

    public String getNaam() {
        return naam;
    }

    public int getGeslaagdAantal() {
        return GeslaagdAantal;
    }

    public void setGeslaagdAantal(int geslaagdAantal) {
        GeslaagdAantal = geslaagdAantal;
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

    public void setIngelogdestudent(Student ingelogdestudent) {
        this.ingelogdestudent = ingelogdestudent;
    }

    public static ArrayList<Student> addStudent() {
        alleStudenten.add(new Student("Mehmet"));
        alleStudenten.add(new Student("Turan"));
        alleStudenten.add(new Student("Furkan"));
        alleStudenten.add(new Student("Nazih"));
        return alleStudenten;
    }

    public static void studentGeslaagd() {
        Scanner scanner = new Scanner(System.in);
        studentenLijst();
        System.out.println("Naam");
        String student = scanner.nextLine();
        System.out.println("Studentennummer");
        int studentenNummer = scanner.nextInt();
        if (Cijfers.size() == 0) {
            System.out.println("Student " + student + " heeft geen examens gemaakt");
        }
        for (int i = 0; i < Cijfers.size(); i++) {
            if (studentenNummer != Cijfers.get(i).getStudentenNummer() || !student.equalsIgnoreCase(Cijfers.get(i).getNaam())) {
                System.out.println("Student " + student + " heeft geen examens gemaakt");
            } else if (studentenNummer == Cijfers.get(i).getStudentenNummer()) {
                System.out.println("Student " + Cijfers.get(i).getNaam() + " | " + Cijfers.get(i).getStudentenNummer() + " heeft een " + Cijfers.get(i).getCijfer() + " gehaald voor " + Cijfers.get(i).getExamen());
                if (Cijfers.get(i).getCijfer() >= 5.5) {
                    System.out.println("Geslaagd");
                } else if (Cijfers.get(i).getCijfer() < 5.5) {
                    System.out.println("Gezakt");
                }
            }
        }
    }

    @Override
    public String toString() {
        return ("Student naam: "+this.getNaam()+
                " Student No: "+ this.getNummer());
    }

    public static void studentenLijst() {
        for (int i = 0; i < alleStudenten.size(); i++) {
            System.out.println(i + 1 + ". " + alleStudenten.get(i).getNaam() + " | " + alleStudenten.get(i).nummer);
        }
    }

    public static void studentInschrijven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is uw naam?");
        String naam = scanner.nextLine();
        int uniekNummer = 21234567;
        for (int i = 0; i < alleStudenten.size(); i++) {
            uniekNummer = uniekNummer + 1;
        }
        alleStudenten.add(new Student(naam));
        System.out.println("Student " + naam + " is aangemaakt");
    }

    public static void studentVerwijderen() {
        Scanner scanner = new Scanner(System.in);
        studentenLijst();
        System.out.println("Welke student wil je verwijderen?");
        System.out.println("Studentennummer");
        int deleteNummer = scanner.nextInt();
        for (int i = 0; i < alleStudenten.size(); i++) {
            if (alleStudenten.get(i).getNummer() == deleteNummer) {
                System.out.println("Student " + alleStudenten.get(i).getNaam() + " | " + alleStudenten.get(i).getNummer() + " is verwijderd uit het systeem");
                alleStudenten.remove(i);
            } else {
                System.out.println("Ongeldige studentennummer");
            }
        }
    }

    public static Student inloggen() {
        Student ingelogdeStudent;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is uw naam?");
        String naam = scanner.nextLine();
        System.out.println("Wat is uw studentennummer?");
        int studentenNummer = scanner.nextInt();
        boolean b = false;
        for (int i = 0; i < alleStudenten.size(); i++) {
            String aa= alleStudenten.get(i).naam;
            int bb = alleStudenten.get(i).nummer;
            if (naam.equalsIgnoreCase(aa) && studentenNummer == bb) {
                System.out.println("U wordt ingelod");
                b = true;
                return  alleStudenten.get(i);
            }
        }
        if (!b){
            System.out.println("Ongeldige combinatie van naam en studentennummer");
            b = true;
            System.out.println("Wat is uw naam?");
            naam = scanner.next();
            System.out.println("Wat is uw studentennummer?");
            studentenNummer = scanner.nextInt();
        }
        return null;
    }

    private static Integer uniekNummer(){
        int nummer = studentNummerId;
        studentNummerId++;
        return nummer;
    }
}

class Menu {
    protected static ArrayList<String> Menu = new ArrayList<>();
    public Menu() {
    }

    public static void addMenu() {
        Menu.add("Lijst met studenten");
        Menu.add("Lijst met examens");
        Menu.add("Nieuwe student inschrijven");
        Menu.add("Student verwijderen");
        Menu.add("Examen afnemen");
        Menu.add("Welke examens heeft student gehaald?");
        Menu.add("Welke student heeft de meeste examens gehaald?");
        Menu.add("Exit");
    }
    public static void printMenu(){
        for (int i = 0; i < Menu.size(); i++) {
            System.out.println(i + 1 + ". " + Menu.get(i));
        }
    }
}

public class Main {
    protected static String inlogNaam;
    protected static int studentNummer;
    protected static boolean nogEenKeer;

    protected static ArrayList<Examen> Examens = new ArrayList<>();
    protected static ArrayList<Vraag> rekenVragen = new ArrayList<>();
    protected static ArrayList<Vraag> wiskundeVragen = new ArrayList<>();
    protected static ArrayList<Cijfer> Cijfers = new ArrayList<>();
    protected static ArrayList<Student> alleStudenten = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu.addMenu();
        Examen.addExamenLijst();
        Examen.addRekenExamen();
        Examen.addWiskundeExamen();
        nogEenKeer = true;
        do {
            System.out.println("[Controle paneel]");
            Menu.printMenu();
            System.out.println("Voer een commandnummer in");
            int commandnummer = scanner.nextInt();
            if (commandnummer == 1) {
                System.out.println("Studentenlijst");
                Student.addStudent();
                Student.studentenLijst();
            } else if (commandnummer == 2) {
                System.out.println("Examenlijst");
                Examen.examenLijst();
                System.out.println("________________");
            } else if (commandnummer == 3) {
                System.out.println("Student inschrijven");
                Student.studentInschrijven();
                System.out.println("________________");
            } else if (commandnummer == 4) {
                System.out.println("Student verwijderen");
                Student.studentVerwijderen();
                System.out.println("________________");
            } else if (commandnummer == 5) {
                System.out.println("Log in voordat je een examen kan afnemen");
                Student.inloggen();
                System.out.println("________________");
            } else if (commandnummer == 6) {
                System.out.println("Welke student wil je opzoeken?");
                Student.studentGeslaagd();
                System.out.println("________________");
            } else if (commandnummer == 7) {
                System.out.println("Welke student heeft de meeste examens gehaald?");
                Cijfer.printCijfers();
                System.out.println("________________");
            } else if (commandnummer == 8) {
                System.out.println("Het systeem wordt afgesloten");
                nogEenKeer = false;
            } else {
                System.out.println("Command ongeldig");
                System.out.println("________________");
            }
        } while(nogEenKeer);
    }
}

package project;

import java.util.Scanner;

class Aluno extends Person {
    private int registration;
    private String cnumber;

    public Aluno(String name, int age, int registration, String cnumber) {
        super(name, age);
        this.registration = registration;
        this.cnumber = cnumber;
    }

    public int getRegistration() {
        return registration;
    }

    public String getCnumber() {
        return cnumber;
    }

    public void inputAlunoDetails() {
        inputDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your Registration: ");
        this.registration = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Type your Classe Number: ");
        this.cnumber = scanner.nextLine();
    }

    public void displayAlunoDetails() {
        displayDetails();
        System.out.println("Your Registration: " + registration);
        System.out.println("Class Number: " + cnumber);
    }
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Mauricio", 10, 3001, "Class 2B");
        aluno.inputAlunoDetails();
        aluno.displayAlunoDetails();
    }
}
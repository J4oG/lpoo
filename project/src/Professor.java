package project;

import java.io.Serializable;
import java.util.Scanner;

class Professor extends Person implements Serializable {
		
		private static final long serialVersionUID = 1L;
		private String discipline;
		private int Yoe;
		private int id_prof;
	
	public Professor (String name, int age, String discipline, int yoe, int id_prof) {
		super(name, age);
		this.setDiscipline(discipline);
		this.setYoe(yoe);
		this.setId_prof(id_prof);
	
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public int getYoe() {
		return Yoe;
	}

	public void setYoe(int yoe) {
		Yoe = yoe;
	}
	
	public int getId_prof() {
		return id_prof;
	}

	public void setId_prof(int id_prof) {
		this.id_prof = id_prof;
	}
	
	public void inputProfessorDetails() {
        inputDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your disciplina: ");
        this.discipline = scanner.nextLine();

        System.out.print("Type your Years of Experience: ");
        this.Yoe = scanner.nextInt();
    }

    public void displayProfessorDetails() {
        displayDetails();
        System.out.println("Your Discipline: " + discipline);
        System.out.println("Years of Experience: " + Yoe);
    }
}
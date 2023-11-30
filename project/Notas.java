package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Notas {
	
	private float Nota1;
	private float Nota2;
	private String AlunoN;

	public Notas() {
	}

	public float getNota1() {
		return Nota1;
	}

	public void setNota1(float nota1) {
		Nota1 = nota1;
	}

	public float getNota2() {
		return Nota2;
	}

	public void setNota2(float nota2) {
		Nota2 = nota2;
	}

	public String getAlunoN() {
		return AlunoN;
	}

	public void setAlunoN(String alunoN) {
		AlunoN = alunoN;
	}

	public void inputNotasDetails() {
		Scanner viewer = new Scanner(System.in);

		try {
			System.out.print("Digite o nome do aluno: ");
			this.AlunoN = viewer.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Error: Unable to create student name, please try again");
    }

		try {
			System.out.print("Digite a nota 1: ");
		    this.Nota1 = viewer.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println("Error: Unable to get the first student grade, please try again");
			viewer.nextLine();
    }

    try {
        System.out.print("Digite a nota 2: ");
        this.Nota2 = viewer.nextFloat();
    } catch (InputMismatchException e) {
        System.out.println("Error: Unable to get the second student grade, please try again");
        viewer.nextLine();
    }
}

	public void calcularMedia() {
		float media = (Nota1 + Nota2) / 2;
		System.out.println("Nome do aluno: " + AlunoN);
		System.out.println("Nota 1: " + Nota1);
		System.out.println("Nota 2: " + Nota2);
		System.out.println("Média: " + media);

		if (media >= 7) {
			System.out.println("Situação: Aprovado");
		} else {
			System.out.println("Situação: Reprovado");
    }
}

 public static void main(String[] args) {
     Notas notas = new Notas();
     notas.inputNotasDetails();
     notas.calcularMedia();
 }
}
package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
	 
	 public String name;
	 public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Type your name: ");
            this.name = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error: Unable to create name, try again");
        }

        try {
            System.out.print("Type your Age: ");
            this.age = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Unable to create age, try again");
            scanner.nextLine();
        }
    }

    public void displayDetails() {
        System.out.println("Your Nome: " + name);
        System.out.println("Your Age: " + age);
    }
		 public static void main(String[] args) {

		 }
}
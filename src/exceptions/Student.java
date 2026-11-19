package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	
	public static void main(String[] args) {
		int rollNo = 0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = sc.next();
		try {
			System.out.println("Enter roll number");
			rollNo = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		System.out.println("Welcome "+name+" "+rollNo);
		sc.close();
	}

}

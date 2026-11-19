package practice;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade      : " + grade);

        sc.close();
    }
}
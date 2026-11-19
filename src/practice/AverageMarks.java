package practice;

import java.util.Scanner;

public class AverageMarks {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        int total = 0;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        double average = total / 5.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        sc.close();
    }

}

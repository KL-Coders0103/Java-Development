package practice;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        sc.close();
	}

}

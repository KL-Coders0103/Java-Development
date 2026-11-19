package arrayDemo;

public class BasicProgram {

	public static void main(String[] args) {
		int arr[] = {12,23,34,45,56};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// Length of Array
		int count = 0;
		for(int j : arr) {
			count++;
		}
		System.out.println("Length of array is : "+count);
		
		
		// Mmax number 
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum number from array is: "+max);
		
		// Min number
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum number from array is: "+min);
		
		
		// Sum of array
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of array is: "+sum);
		
		//Average of Array
		double avg = (double) sum / arr.length;
		System.out.println("Average of array is: "+avg);
	}

}

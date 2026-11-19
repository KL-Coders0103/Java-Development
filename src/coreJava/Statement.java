package coreJava;

public class Statement {

	public static void main(String[] args) {
		// if-else
		int num = 05;
		if(num%2 ==0) {
			System.out.println(num +" is Even");
		} else {
			System.out.println(num + " is Odd");
		}
		
		
		// if-else ladder
		int result = 65;
		if(result>90){
			System.out.println("Congratulations! You passed with A division");
		} else if(result >=70 && result <=90){
			System.out.println("Congratulations! You passed with B division");
		} else if(result >=50 && result <70){
			System.out.println("Congratulations! You passed with C division");
		} else if(result >=35 && result <50){
			System.out.println("Congratulations! You passed with D division");
		} else {
			System.out.println("Better luck next time! Practice Hard in next exam...You got failed this time");
		}
		
		
		//nested if-else
		int age = 15;
		if(age>0){
			if(age >=18){
				System.out.println("Person is Eligible for voting");
			} else {
				System.out.println("Person is not Eligible for voting");
			}
		} else {
			System.out.println("Person's age should be greater than 0");
		}
	}

}

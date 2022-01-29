package test;

import java.util.Scanner;

public class PrimeNumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int num = scanner.nextInt();
//		int num = 13;
		boolean flag = true;
	
		for(int index=2;index<num;index++) {
			
			int reminder = num%index;
			if(reminder == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("The num is prime no.");
			
		}
		else {
			System.out.println("The num is not prime no.");
		}
		scanner.close();
	}
	

}

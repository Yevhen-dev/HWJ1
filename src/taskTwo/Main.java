package taskTwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input apple price ");
		double applePrice = sc.nextDouble();
		System.out.println("Input quantity of apples ");
		int quantity = sc.nextInt();
		double totalSum = applePrice * quantity;
		
		
		System.out.println( totalSum + " $");
	}

}
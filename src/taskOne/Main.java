package taskOne;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Input side A length: ");
		double sideA = sc.nextDouble();
		
		System.out.println("Input side B length: ");
		double sideB = sc.nextDouble();
		
		System.out.println("Input side C length: ");
		double sideC = sc.nextDouble();
		
		double p = ( sideA + sideB + sideC )/2;
		
		double result = Math.sqrt( p * ( p - sideA ) * ( p - sideB ) * ( p - sideC ) );
		
		System.out.println("Area of a triangle is: " + result);
	}

}

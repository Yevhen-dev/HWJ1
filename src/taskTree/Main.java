package taskTree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Input petrol price" );
		double petrolPrice = sc.nextDouble();
		
		System.out.println( "Input your consumption on 100 miles" );
		double consumption = sc.nextDouble();
		
		System.out.println( "Input distance to your destination" );
		double distance = sc.nextDouble();
		
		double result = distance/100 * consumption * petrolPrice;
		
		System.out.println( "You will spend on a petrol: " + result + "$" );

	}

}

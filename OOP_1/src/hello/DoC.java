package hello;

import java.util.Scanner;

public class DoC {
	public static void main(String[] args) {
		System.out.println("First Assignment: \"Echo.\"");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insert Fahrenheit temperature: ");
		double faher = input.nextDouble();
		
		double cels = 5.0/9*(faher-32);
		System.out.println("Second Assignment: "+cels);
		
	}
}

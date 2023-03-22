package oop_2;

import java.util.Scanner;

public class Class_20230320 {
	public static void main(String[] args) {
		System.out.println("Insert Number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(i+j < num -1) {
					System.out.print("       ");
				}
				else System.out.print("*      ");
			}
			System.out.print("\n\n\n");
		}
	}
}
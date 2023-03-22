package oop_2;

public class Class_20230322 {
	public static void main(String[] args) {
		for(int k = 0; k <86; k++) {
			if(k == 44)
				System.out.print("Multiplication Table");
			System.out.print("*");
		}
		System.out.println("");
		
		for(int i = 2; i<10; i++) {
			if(i == 5) {
				System.out.println("");
				break;
			}
			for(int j = 1; j < 10; j++) {
				if(i*j<10)
					System.out.print(i + " * " + j + " = " + i * j + "   ");
				else
					System.out.print(i + " * " + j + " = " + i * j + "  ");
			}
			System.out.println("");
		}
		
	}
}
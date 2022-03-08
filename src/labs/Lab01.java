package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
	 // asks and scans for a 2 integer //
		System.out.print("Insert postive integer");
		Scanner scan1 = new Scanner(System.in);
		int x = scan1.nextInt();
		System.out.print("Insert integer");
		int y = scan1.nextInt();
		// takes the integers and puts the first input to the power of the second one//
		double num1pow = Math.pow(x, y);
		System.out.print( x + "^" + y + " = " + num1pow);
	}
	
	
	
	
	public static void problem02() {
		// scans for a number //
		System.out.print("\nInsert postive integer");
		Scanner scan1 = new Scanner(System.in);
		double x = scan1.nextDouble();
		// takes the double, square roots it then prints it //
		double C = Math.sqrt(x);
		System.out.print("The Square root is " + C);
	}

	
	

	public static void problem03() {
		
		System.out.print("Side A \n");
		Scanner scan1 = new Scanner(System.in);
		double x = scan1.nextDouble();
		System.out.print("Side B \n");
		double y = scan1.nextDouble();
		// finds the length of the hypotenuse of the triangle//
		double c =Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
		System.out.print(c);
	}


	
	
	public static void problem04() {
		// variables for code//
		int t = 0;
		int x = 0;
		int y = 0;
		// scans for input //
		Scanner scan1 = new Scanner(System.in);
		System.out.print("\nInsert a integer \n");
		// the while loops check if the input is a zero and repeats until so
		//Finds the max and min of the inputs
		while(t != 1){
		int input1 = scan1.nextInt();
		if (input1 == 0) {
		t = 1;
		}
		else {
			if (input1 > x) {
			x = input1;
			}
			if (input1 < y) {
				y = input1;
				}
		}
		}
		// prints the answer
		System.out.print("Max = " + x + "\nMin = " + y);
	}

	
	
	
	
	
	
}

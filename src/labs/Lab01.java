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
		System.out.print("Insert postive integer");
		Scanner scan1 = new Scanner(System.in);
		int x = scan1.nextInt();
		System.out.print("Insert integer");
		Scanner scan2 = new Scanner(System.in);
		int y = scan2.nextInt();
		double num1pow = Math.pow(x, y);
		System.out.print( x + "^" + y + " = " + num1pow);
	}
	
	
	
	
	public static void problem02() {
		
		System.out.print("\nInsert postive integer");
		Scanner scan1 = new Scanner(System.in);
		int x = scan1.nextInt();
		double C = Math.sqrt(x);
		System.out.print("The Square root is " + C);
	}

	
	

	public static void problem03() {
		System.out.print("Side A");
		Scanner scan1 = new Scanner(System.in);
		int x = scan1.nextInt();
		System.out.print("Side B");
		Scanner scan2 = new Scanner(System.in);
		int y = scan2.nextInt();
		Math.sqrt(x);
		Math.sqrt(y);
		int c = x + y;
		Math.sqrt(c);
		System.out.print(c);
	}


	
	
	public static void problem04() {
		int t = 0;
		int x = 0;
		int y = 0;
		while(t != 1){
		System.out.print("\nInsert a integer");
		Scanner scan1 = new Scanner(System.in);
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
		System.out.print("MAX = " + x + "\nMIN = " + y);
	}

	
	
	
	
	
	
}

package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		int t = 0;
		int x = 0;
		int y = 0;
		System.out.print("Insert Integer");
		Scanner scan = new Scanner(System.in);
		int input1 = scan.nextInt();
		System.out.print("Insert Integer");
		Scanner scan2 = new Scanner(System.in);
		int input2 = scan2.nextInt();
		if (input1 - input2 < 0) {
			x = input2;
			y = input1;
			
		}
		else {
			x = input1;
			y = input2;
		}
	x = x - y;
		for (int i = 10; i >= 0; i -= 1) {
			int num1 = (int) (Math.random() * x + y);
			System.out.print(" " + num1);
			
		}
	}
	
	
	
	
	
	public static void problem02() {
		System.out.print("\nInsert Radius");
		Scanner scan1 = new Scanner(System.in);
		double input1 = scan1.nextInt();
		System.out.print("Insert height");
		Scanner scan2 = new Scanner(System.in);
		double input2 = scan2.nextInt();
		input1 *= 2;
		System.out.println(Math.PI * input1 * input2);
		
	}

	
	

	public static void problem03() {
		double Y = 0;
		double X = 0;
		System.out.println("Midpoint Formula Calulator");
		System.out.println("x1?");
		Scanner scan1 = new Scanner(System.in);
		double x1 = scan1.nextInt();
		System.out.println("x2?");
		Scanner scan2 = new Scanner(System.in);
		double x2 = scan2.nextInt();
		System.out.println("y1?");
		Scanner scan3 = new Scanner(System.in);
		double y1 = scan3.nextInt();
		System.out.println("y2?");
		Scanner scan4 = new Scanner(System.in);
		double y2 = scan4.nextInt();
	X =x1 + x2 /2;
	Y =y1 + y2 /2;
	System.out.println("(" + X + ", " + Y + ")");
	}


	
	
	public static void problem04() {
		double x = 0;
		System.out.println("A?");
		Scanner scan1 = new Scanner(System.in);
		double A = scan1.nextInt();
		System.out.println("B?");
		Scanner scan2 = new Scanner(System.in);
		double B = scan2.nextInt();
		System.out.println("C?");
		Scanner scan3 = new Scanner(System.in);
		double C = scan3.nextInt();
		double T = Math.pow(B, 2);
		x = -B + Math.sqrt(T- 4*(A*B))/(2*A);
		System.out.println(x);
	}
	
	

	
}

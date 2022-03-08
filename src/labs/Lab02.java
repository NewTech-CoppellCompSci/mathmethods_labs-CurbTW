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
		int input2 = scan.nextInt();
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
		System.out.print("\nInsert Radius \n");
		Scanner scan1 = new Scanner(System.in);
		double input1 = scan1.nextInt();
		System.out.print("Insert height \n");
		double input2 = scan1.nextInt();
		System.out.println(Math.PI * input2 * Math.pow(input1,2));
		
	}

	
	

	private static void pow() {
		// TODO Auto-generated method stub
		
	}



	public static void problem03() {

		double d = 0;
		System.out.println("Midpoint Formula Calulator");
		System.out.println("x1?");
		Scanner scan1 = new Scanner(System.in);
		double x1 = scan1.nextDouble();
		System.out.println("y1?");
		double y1 = scan1.nextDouble();
		System.out.println("x2?");
		double x2 = scan1.nextDouble();
		System.out.println("y2?");
		double y2 = scan1.nextDouble();
		d = (Math.pow((x2 - x1),2)+Math.pow((y2-y1),2));
	System.out.println("\n" + Math.sqrt(d));
	}


	
	
	public static void problem04() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A value");
		double A = scan.nextDouble();
		System.out.println("Enter B value");
		double B = scan.nextDouble();
		System.out.println("Enter C value");
		double C = scan.nextDouble();
		
		double part1 = ((B * B) - (4*A*C));
		double part2 = (-B+Math.sqrt(part1));
		double part3 = (-B-Math.sqrt(part1));
		double x1 = part2 /(2*A);
		double x2 = part3 /(2*A);
		System.out.println("x1 = " + x1 +"\n x2 = " + x2);
	}
	
	

	
}

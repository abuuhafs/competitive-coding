package RUProgrammingPractice1;

import java.util.Scanner;

public class Tetration {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double N = input.nextDouble();
		
		//System.out.println(tetrate(3, 3));
		//System.out.println(Math.pow(2, 16)); 
		/*
		double N = Math.pow(3, 27);
		for(int i = 0; i < 3; i++)
			N = Math.cbrt(N);
		System.out.println(N);*/
		/*
		double N = 65536.0;
		for(int i = 0; i < 3; i++)
			N = Math.pow(Math.E, (Math.log(N)/2));*/
		
		//System.out.println(Math.pow(Math.E, (Math.log(65536)/(2))));
		/*
		double N = 2.000000;
		double a;
		
		while(true) {
			a = Math.log(N);
			if(a >= 0.36788 && a <= 2.718281) {
				System.out.println(N);
				System.exit(0);
			}
			N = a;
		}
		*/
		
		//double a;		
		 
		double answer = Math.pow(N, (1/N));
		System.out.printf("%f ", answer);
		System.exit(0);
	}
	
	public static double tetrate(int a, int n) {
		if(n == 1)
			return a;
		else 
			return Math.pow(a, tetrate(a, n-1));
	}
	
	public static double tetrateN(int a, int n) {
		if(n == 4)
			return 65536;
		else 
			return Math.pow(a, tetrate(a, n-1));
	}

}

package RUProgrammingPractice2;

import java.util.Scanner;

public class Tractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		int A;
		int B;
		
		for(int i = 0; i < cases; i++)
		{
			A = scan.nextInt();
			B = scan.nextInt();
			System.out.println(A + B + 1);
		}

	}

}

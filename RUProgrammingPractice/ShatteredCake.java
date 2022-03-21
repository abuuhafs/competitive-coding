package RUProgrammingPractice1;

import java.util.Scanner;

public class ShatteredCake {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int width = input.nextInt();
		int num = input.nextInt();
		int area = 0;
		
		for(int i = 0; i < num; i++)
		{
			area += input.nextInt() * input.nextInt();
		}
		
		System.out.println(area / width);

	}

}

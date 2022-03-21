package RUProgrammingPractice1;

import java.util.Scanner;

public class Bishops {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int board;
		//int bishops;
		
		while (input.hasNext())
		{
			board = input.nextInt();
			if(board < 1)
				System.out.println(0);
			else if(board == 1)
				System.out.println(1);
			else
				System.out.println((board - 1) * 2);
		}

	}

}

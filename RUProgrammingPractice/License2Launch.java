package RUProgrammingPractice1;

import java.util.Scanner;

public class License2Launch {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int lowValue = input.nextInt();
		int value;
		int lowIndex = 0;
		
		for(int i = 1; i < num; i++) 
		{
			value = input.nextInt();
			if(value < lowValue)
			{
				lowValue = value;
				lowIndex = i;
			}		
		}
		System.out.println(lowIndex);

	}

}

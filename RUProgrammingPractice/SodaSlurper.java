package RUProgrammingPractice1;

import java.util.Scanner;

public class SodaSlurper {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int bottles = input.nextInt() + input.nextInt();
		int buyNew = input.nextInt();
		
		int drank = 0;
		int drinks = 0;	
		
		while (true) {
			drinks = bottles / buyNew;
			//assert(drinks == 2);
			bottles = bottles % buyNew + drinks;
			drank += drinks;
			if (bottles < buyNew) 
			{
				System.out.println(drank);
				System.exit(0);
			}
		}

	}

}

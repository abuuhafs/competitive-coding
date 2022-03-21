package RUProgrammingPractice1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GrandpasCheckerboard {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		List<String> rows = new ArrayList<>();
		int whitesr = 0;
		int blacksr = 0;
		int whitesc = 0;
		int blacksc = 0;
		int correct = 1;
		
		int wconsec = 0;
		int bconsec = 0;
		
		int num = input.nextInt();
		input.nextLine();
		for(int i = 0; i < num; i++)
			rows.add(input.nextLine());
	
		// loop through rows
		for(int i = 0; i < num; i++) 
		{
			for(int j = 0; j < num; j++)
			{
				if(rows.get(i).charAt(j) == 'B')
				{
					blacksr++;
					bconsec++;
					wconsec = 0;
				}
				else
				{
					whitesr++;
					wconsec++;
					bconsec = 0;
				}
				if(bconsec == 3 || wconsec == 3)
				{
					correct = 0;
					System.out.println(correct);
					System.exit(0);
				}
			}
			if(whitesr != blacksr)
			{
				correct = 0;
				System.out.println(correct);
				System.exit(0);
			}
			blacksr = 0;
			whitesr = 0;
			bconsec = 0;
			wconsec = 0;
		}
		
		// loop through columns
		for(int i = 0; i < num; i++) 
		{
			for(int j = 0; j < num; j++)
			{
				if(rows.get(j).charAt(i) == 'B')
				{
					blacksc++;
					bconsec++;
					wconsec = 0;
				}
				else
				{
					whitesc++;
					wconsec++;
					bconsec = 0;
				}
				if(bconsec == 3 || wconsec == 3)
				{
					correct = 0;
					System.out.println(correct);
					System.exit(0);
				}
			}
			if(whitesc != blacksc)
			{
				correct = 0;
				System.out.println(correct);
				System.exit(0);
			}
			blacksc = 0;
			whitesc = 0;
			bconsec = 0;
			wconsec = 0;
		}
		
		System.out.println(correct);
		System.exit(0);

	}

}

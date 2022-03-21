package RUProgrammingPractice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EightQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = 0;
		char cell;
		List<String> rows = new ArrayList<>();
		//char[][] board = new char[8][8];
		for(int i = 0; i < 8; i++)
			rows.add(scan.nextLine());
		
		int m,n;  // for diagonals
		
		/*for(int i = 0; i < 8; i++)
			System.out.println(rows.get(i));*/
		
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				cell = rows.get(i).charAt(j);
				if(cell == '*')
				{
					count++;
					// check all cells to the right
					for(int k = j+1; k < 8; k++)
					{
						if(rows.get(i).charAt(k) == '*')
							invalid();
					}
					
					// check all cells down
					for(int k = i+1; k < 8; k++)
					{
						if(rows.get(k).charAt(j) == '*')
							invalid();
					}
					
					// check all diagonal right
					m = i + 1;
					n = j + 1;
					while(m < 8 && n < 8)
					{
						if(rows.get(m).charAt(n) == '*')
							invalid();
						m++;
						n++;
					}
					
					// check all diagonal left
					m = i + 1;
					n = j - 1;
					while(m < 8 && n >= 0)
					{
						if(rows.get(m).charAt(n) == '*')
							invalid();
						m++;
						n--;
					}
					
				}
				//continue;
			}
		}
		if(count != 8) 
			invalid();
	
		System.out.println("valid");
		
	}
	
	public static void invalid() {
		System.out.println("invalid");
		System.exit(0);
	}

}

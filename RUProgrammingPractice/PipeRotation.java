package RUProgrammingPractice1;

import java.util.Scanner;

public class PipeRotation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		String[] rows = new String[N];
		boolean valid = true;
		boolean rowFailed = false;
		boolean colFailed = false;
		int total = 0;
		int fail = 0;
		int cR = 0;
		int cC = 0;
		char cell;
		char col;
		
		// get the rows of input
		for(int i = 0; i < N; i++)
		{
			rows[i] = input.next();
		}
		
		
		for(int j = 0; j< M; j++) 
		{
			for(int i = 0; i < N; i++)
			{
				col = rows[i].charAt(j);
				
				if(col == 'A')
				{
					//if(cC > 0 && cC % 2 == 1)
						//valid = false;
					;
				}else if(col == 'B')
				{
					total++;
					if(cC % 2 == 0)
						fail++;
				}else if(col == 'C')
				{
					cC++;
				}else
				{
					//total++;
					if(cC % 2 == 0)
						valid = false;
				}
			}
			if(cC % 2 == 1)
				valid = false;
			cC = 0;
		}
		
		for(int i = 0; i < N; i++) 
		{
			for(int j = 0; j < M; j++)
			{
				cell = rows[i].charAt(j);
				
				if(cell == 'A')
				{
					//if(cR > 0 && cR % 2 == 1)
						//valid = false;
					;
				}else if(cell == 'B')
				{
					if(cR % 2 == 0)
						fail++;
					//check up and down first
					if((i == 0 || rows[i-1].charAt(j) == 'A') || (i == N-1 || rows[i+1].charAt(j) == 'A'))
					{
						// now check left and right
						if((j == 0 || rows[i].charAt(j-1) == 'A') || (j == M-1 || rows[i].charAt(j+1) == 'A'))
							valid = false;
					}
				}else if(cell == 'C')
				{
					cR++;
					if((i == 0 || rows[i-1].charAt(j) == 'A') || (j == M-1 || rows[i].charAt(j+1) == 'A'))
						if((j == M-1 || rows[i].charAt(j+1) == 'A') || (i == N-1 || rows[i+1].charAt(j) == 'A'))
							if((i == N-1 || rows[i+1].charAt(j) == 'A') || (j == 0 || rows[i].charAt(j-1) == 'A'))
								if((j == 0 || rows[i].charAt(j-1) == 'A') || (i == 0 || rows[i-1].charAt(j) == 'A'))
									valid = false;
				}else
				{
					if(cR % 2 == 0)
						valid = false;
					
					if(i == 0 || rows[i-1].charAt(j) == 'A')  // up
						valid = false;
					if(j == 0 || rows[i].charAt(j-1) == 'A')  // left
						valid = false;
					if(j == M-1 || rows[i].charAt(j+1) == 'A')  // right
						valid = false;
					if(i == N-1 || rows[i+1].charAt(j) == 'A')  // down
						valid = false;
				}
			}
			
			if(cR % 2 == 1)
				valid = false;
			cR = 0;
		}
		
		if(fail != total) 
			valid = false;
		//System.out.println(total);
		//System.out.println(fail);
		System.out.println(valid ? "Possible" : "Impossible");
		System.exit(0);

	}

}

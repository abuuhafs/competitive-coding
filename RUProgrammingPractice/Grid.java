package RUProgrammingPractice3;

import java.util.Arrays;
import java.util.Scanner;

public class Grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt(); 
		int columns = scan.nextInt();
		String line;
		String[] ts;
		scan.nextLine();
		int[][] grid = new int[rows][columns];
		
		
		for(int i = 0; i < rows; i++)
		{
			line = scan.nextLine();
			ts = line.split("");
			for(int j = 0; j < columns; j++)
			{
			
				grid[i][j] = Integer.parseInt(ts[j]);
			}
		}
		displayGrid(grid, rows, columns);
	}
	
	public static void displayGrid(int[][] grid, int rows, int columns) {
		for(int i = 0; i < rows; i++)
		{
			
			for(int j = 0; j < columns; j++)
			{
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}

}

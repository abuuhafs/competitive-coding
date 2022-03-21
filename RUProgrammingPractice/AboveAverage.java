package RUProgrammingPractice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AboveAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		int students;
		double total = 0;
		int grade;
		double above = 0;
		List<Integer> grades = new ArrayList<Integer>();
		double average;
		
		for(int i = 0; i < cases; i++)
		{
			students = input.nextInt();
			for(int j = 0; j < students; j++)
			{
				grade = input.nextInt();
				grades.add(grade);
				total += grade;
			}
			average = total / students;
			
			for(int j = 0; j < students; j++)
			{
				if(grades.get(j) > average)
					above++;
			}
			
			//display result
			System.out.printf("%n%.03f%%", (double)((above/students)*100));
			//System.out.println();
			
			//reset variable
			grades.clear();
			total = 0;
			above = 0;
		}
		System.exit(0);
	}
}

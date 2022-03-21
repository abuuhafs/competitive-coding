package RUProgrammingPractice1;

import java.util.Scanner;

public class Ants {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		StringBuilder out = new StringBuilder();
		int length, middle;
		int ants, value;
		int closest;
		int farthest;
		
		for(int i = 0; i < cases; i++)
		{
			length = input.nextInt();
			middle = length / 2;
			closest = length;
			farthest = middle;
			ants = input.nextInt();
			
			for(int j = 0; j < ants; j++)
			{
				value = input.nextInt();
				if(Math.abs(value - middle) < Math.abs(closest - middle))
				{
					closest = value;
				}
				if(value <= middle)
				{
					if(farthest > middle)
					{
						if(length - value >= farthest)
							farthest = value;
					}else
					{
						if(length - value >= length - farthest)
							farthest = value;
					}
					
				}else
				{
					if(farthest > middle)
					{
						if(value > farthest)
							farthest = value;
					}else
					{
						if(value > length - farthest)
							farthest = value;
					}		
				}
			}
			
			out.append(closest < length-closest ? closest + " ": length-closest + " ");
			out.append(farthest > middle ? farthest + "\n": length-farthest + "\n");
		}
		
		System.out.println(out.toString());
		System.exit(0);

	}

}

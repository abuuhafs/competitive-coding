package RUProgrammingPractice1;

import java.util.Scanner;

public class SoftPasswords {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String S = input.nextLine();
		String P = input.nextLine();
		
		StringBuilder Sb = new StringBuilder(S);
		
		char first = S.charAt(0);
		char last = S.charAt(S.length()-1);
		
		String accepted = "No";
		
		if(S.equals(P))
			accepted = "Yes";
		if(Character.isDigit(first) && P.equals(Sb.substring(1)))
			accepted = "Yes";
		if(Character.isDigit(last) && P.equals(Sb.substring(0, Sb.length()-1)))
			accepted = "Yes";
		
		for(int i = 0; i < Sb.length(); i++)
		{
			if(Character.isLetter(Sb.charAt(i)))
			{
				if(Character.isUpperCase(Sb.charAt(i)))
					Sb.setCharAt(i, Character.toLowerCase(Sb.charAt(i)));
				else
					Sb.setCharAt(i, Character.toUpperCase(Sb.charAt(i)));
			}		
		}
		
		if(P.equals(Sb.toString()))
			accepted = "Yes";
		
		System.out.println(accepted);

	}

}

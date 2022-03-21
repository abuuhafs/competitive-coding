package RUProgrammingPractice2;

import java.util.Scanner;

public class MixedFractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		int k;
		int whole;
		int numer;
		
		
		while(true) {
			n = input.nextInt();
			k = input.nextInt();
			if(n == 0 && k == 0)
				System.exit(0);
			whole = n / k;
			numer = n % k;
			System.out.println(whole + " " + numer + " / " + k);
		}
		
	}

}

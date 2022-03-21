package RUProgrammingPractice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int val1 = input.nextInt();
		int val2 = input.nextInt();
		int val3 = input.nextInt();
		input.nextLine();
		String order = input.nextLine();
		//System.out.println(val1 + val2 + val3);
		//System.out.println(order);
		
		List<Integer> values = new ArrayList<>(3);
		values.add(val1);
		values.add(val2);
		values.add(val3);
		//int[] values = new int[3];
		
		Collections.sort(values);
		//System.out.println(values.get(0) +" " + values.get(1) + " " + values.get(2));
		
		switch (order.charAt(0)) {
		case 'A':
			System.out.print(values.get(0) + " ");
			break;
		case 'B':
			System.out.print(values.get(1) + " ");
			break;
		case 'C':
			System.out.print(values.get(2) + " ");	
			break;
		}
		
		switch (order.charAt(1)) {
		case 'A':
			System.out.print(values.get(0) + " ");
			break;
		case 'B':
			System.out.print(values.get(1) + " ");
			break;
		case 'C':
			System.out.print(values.get(2) + " ");
			break;
		}
		
		switch (order.charAt(2)) {
		case 'A':
			System.out.print(values.get(0));
			break;
		case 'B':
			System.out.print(values.get(1));
			break;
		case 'C':
			System.out.print(values.get(2));
			break;
		}
		
		System.exit(0);

	}

}

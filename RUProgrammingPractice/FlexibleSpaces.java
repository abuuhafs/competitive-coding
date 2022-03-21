package RUProgrammingPractice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FlexibleSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int v;
		int num;
		List<Integer> ints = new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		ints.add(0);
		for(int i = 0; i < k; i++)
			ints.add(input.nextInt());
		
		ints.add(n);
		System.out.println(ints);
		
		for(int i = 0; i < ints.size(); i++) {
			v = ints.get(i);
			for(int j = 0; j < ints.size(); j++)
			{
				num = Math.abs(v - ints.get(j));
				if(num != 0 && !res.contains(num))
					res.add(num);
			}
		}
		Collections.sort(res);
		for(int i = 0; i < res.size(); i++)
			System.out.print(res.get(i) + " ");
	}

}

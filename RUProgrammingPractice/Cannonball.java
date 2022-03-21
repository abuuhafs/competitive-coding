package RUProgrammingPractice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cannonball {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cans;
		
		Point first;
		Point second;
		double time;
		
		Point start = new Point(scan.nextDouble(), scan.nextDouble(), 0.0);
		Point end = new Point(scan.nextDouble(), scan.nextDouble(), Double.POSITIVE_INFINITY);
		
		cans = scan.nextInt();
		List<Point> cannons = new ArrayList<>();
		cannons.add(start);
		
		for(int i = 0; i < cans; i++)
		{
			cannons.add(new Point(scan.nextDouble(), scan.nextDouble(), Double.POSITIVE_INFINITY));
		}
		cannons.add(end);
		//printCannons(cannons);
		for(int i = 0; i < cannons.size()-1; i++)
		{
			first = cannons.get(i);
			for(int j = i + 1; j < cannons.size(); j++) {
				second = cannons.get(j);
				time = seconds(first, second);
				if(first.getSecs() + time < second.getSecs())
					second.setSecs(first.getSecs() + time);
			}
			cannons.remove(end);
			Collections.sort(cannons);
			cannons.add(end);
			//printCannons(cannons);
		}
		
		System.out.println(end.getSecs());
		//printCannons(cannons);

	} 
	
	public static double seconds(Point p1, Point p2) 
	{
		double distance;
		double calc = Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2);
		distance = Math.sqrt(calc);
		//System.out.println(distance);
		if(p1.getSecs() == 0.0) {
			return distance / 5;
		}
			
		double rem = (distance >= 50 ? distance - 50 : distance);
		
		double seconds = 0.0;
		if(rem == distance)
		{
			if(rem <= 30)
				seconds += (rem) / 5;  // then just run there
			else
			{
				seconds += 2;   // add 2 seconds for cannoning
				seconds += (50 - rem) / 5;  // and then run back to the Point
			}
		}else 
		{
			seconds += (distance >= 50 ? 2 : 0);	
			seconds += (rem) / 5;
		}
		
		return seconds;
	}
	
	public static void printCannons(List<Point> cannons) {
		for(int i = 0; i < cannons.size(); i++)
		{
			System.out.println(cannons.get(i));
		}
	}

}


class Point implements Comparable<Point>{
	
	private double x;
	private double y;
	private double secs;
	
	public Point(double x, double y, double secs) {
		this.x = x;
		this.y = y;
		this.secs = secs;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setSecs(double secs) {
		this.secs = secs;
	}
	
	public double getSecs() {
		return secs;
	}
	
	public String toString() {
		return x + ", " + y + ", " + secs;
	}
	
	public int compareTo(Point p) {
		if(getSecs() > p.secs)
			return 1;
		else if(getSecs() < p.secs)
			return -1;
		else 
			return 0;
	}
	
	
}

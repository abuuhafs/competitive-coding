package RUProgrammingPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CountingStars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        StringBuilder line;
        int rows = 0;
        int columns;
        List<StringBuilder> stars;
       
        do
        {	try {
            	rows  = scan.nextInt();
        	}catch (Exception e) {
        		System.exit(0);
        	}
            columns = scan.nextInt();
            //scan.next();
            stars = new LinkedList<>();
            for(int i = 0; i < rows; i++)
            {
                line = new StringBuilder(scan.next());
                stars.add(line);
            }
            
            count = main(stars, rows, columns, count);
        }while(true);
        
    }
    
    public static int main(List<StringBuilder> stars, int rows, int columns, int count) {
        count++;
        int star = 0;
        Set<Point> visited = new TreeSet<>();
        Queue<Point> explore = new LinkedList<>();
        
        Point fresh;    
        Point current;
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                current = new Point(i, j);
                if(stars.get(current.ro).charAt(current.co) == '-')
                {
                    star++;
                    {
                        visited.add(current);
                        explore.add(current);
                        while(!explore.isEmpty()) {
                            current = explore.remove();
                            if(stars.get(current.ro).charAt(current.co) == '-')
                                stars.get(current.ro).replace(current.co, current.co + 1, "#");
                            
                            if(current.ro >= 1)  // if there is room to go up
                            {
                                fresh = new Point(current.ro - 1, current.co);
                                if(!visited.contains(fresh))
                                {
                                    if(stars.get(fresh.ro).charAt(fresh.co) == '-')
                                    {
                                        stars.get(fresh.ro).replace(fresh.co, fresh.co + 1, "#");
                                        visited.add(fresh);
                                        explore.add(fresh);
                                    }
                                }
                                
                            }
                            if(current.ro < stars.size()- 1)
                            {
                                fresh = new Point(current.ro + 1, current.co);
                                if(!visited.contains(fresh))
                                {
                                    if(stars.get(fresh.ro).charAt(fresh.co) == '-')
                                    {
                                        stars.get(fresh.ro).replace(fresh.co, fresh.co + 1, "#");
                                        visited.add(fresh);
                                        explore.add(fresh);
                                    }
                                }
                            }
                            if(current.co < columns - 1)
                            {
                                fresh = new Point(current.ro, current.co + 1);
                                if(!visited.contains(fresh))
                                {
                                    if(stars.get(fresh.ro).charAt(fresh.co) == '-')
                                    {
                                        stars.get(fresh.ro).replace(fresh.co, fresh.co + 1, "#");
                                        visited.add(fresh);
                                        explore.add(fresh);
                                    }
                                }
                            }
                            if(current.co >= 1)
                            {
                                fresh = new Point(current.ro, current.co - 1);
                                if(!visited.contains(fresh))
                                {
                                    if(stars.get(fresh.ro).charAt(fresh.co) == '-')
                                    {
                                        stars.get(fresh.ro).replace(fresh.co, fresh.co + 1, "#");
                                        visited.add(fresh);
                                        explore.add(fresh);
                                    }
                                }
                            }
                        }
                        visited.clear();
                    }
                }
            }
        }
            
        System.out.println("Case " + count + ": " + star);
        
        
        return count;
    }
    
    public static void showStars(List<StringBuilder> stars) {
    	System.out.println();
        for(int i = 0; i < stars.size(); i++)
        {
            System.out.println(stars.get(i));;
        } 
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }

        public FastScanner(InputStream in) {
            this(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public double nextDouble() { return Double.parseDouble(next());}

    }

}

class Point implements Comparable{
    int ro;
    int co;
    
    public Point(int r, int c) {
        ro = r;
        co = c;
    }
    
    @Override
    public boolean equals(Object o) {
        Point p = (Point) o;
        if(this.co == p.co && this.ro == p.ro)
            return true;
        return false;
    }

	@Override
	public int compareTo(Object o) {
		Point p = (Point) o;
		if(this.ro == p.ro)
			return this.co - p.co;
		else
			return this.ro - p.ro;
	}
    
}
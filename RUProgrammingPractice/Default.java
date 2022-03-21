package RUProgrammingPractice3;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Default implements Runnable {
    public static void main(String [] args) {
        new Thread(null, new Default(), "whatever", 1<<26).start();
    }

    public void run() {

        FastScanner s = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();

      
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
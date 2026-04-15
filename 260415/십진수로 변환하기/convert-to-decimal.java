import java.io.*;
import java.util.*;

public class Main {
	
	static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        int result = 0;
        int binary = 1;
        while(N > 0) {
        	result += N % 2 * binary;
        	binary *= 2;
        	N /= 10;
        }
        System.out.println(result);
        
    }
}
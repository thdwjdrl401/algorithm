import java.io.*;
import java.util.*;

public class Main {
	
	static int A, B, N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(br.readLine());
        
        
        int result = 0;
        int binary = 1;
        while(N > 0) {
        	result += N % 10 * binary;
        	binary *= A;
        	N /= 10;
        }
        StringBuilder sb = new StringBuilder();
        while(result > 0) {
        	sb.append(result % B);
        	result /= B;
        }
        System.out.println(sb.reverse());
        
    }
}
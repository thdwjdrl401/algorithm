import java.io.*;
import java.util.*;

public class Main {
	
	static int N, B;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while(N > 0) {
        	sb.append(N % B);
        	N /= B;
        }
        System.out.println(sb.reverse());
        
    }
}
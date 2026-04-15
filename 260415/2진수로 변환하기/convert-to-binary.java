import java.io.*;
import java.util.*;

public class Main {
	
	static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        
        System.out.println(Integer.toBinaryString(N));
    }
}
import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static int[][] map;
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        map = new int[N][2];
        for (int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int A = Integer.parseInt(st.nextToken());
           	int B = Integer.parseInt(st.nextToken());
           	map[i][0] = A;
           	map[i][1] = B;
		}

        int count = 0;
        for (int i = 0; i < N; i++) {
        	int X1 = map[i][0];
        	int X2 = map[i][1];
        	boolean isTrue = true;
			for (int j = 0; j < N; j++) {
				if(i == j) continue;
				int x1 = map[j][0];
				int x2 = map[j][1];
				
				if(!(X1 < x1 && X2 < x2) && !(X1 > x1 && X2 > x2)) {
					isTrue = false;
					break;
				}
			}
			if(isTrue) count++;
		}
        System.out.println(count);
    }
}
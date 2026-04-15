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
        int max = Integer.MIN_VALUE;
        boolean[] visited = new boolean[1001];
        for (int i = 0; i < N; i++) {
        	int sum = 0;
        	Arrays.fill(visited, false);
			for (int j = 0; j < N; j++) {
				if(j == i) continue;
				int A = map[j][0];
				int B = map[j][1];
				for (int j2 = A; j2 < B ; j2++) {
					if(visited[j2]) continue;
					visited[j2] = true;
					sum++;
				}
			}
			max = Math.max(max, sum);
		}
        System.out.println(max);
    }
}
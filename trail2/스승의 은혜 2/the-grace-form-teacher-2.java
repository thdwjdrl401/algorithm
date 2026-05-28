import java.io.*;
import java.util.*;
public class Main {

	static int N, B;
	static int max = Integer.MIN_VALUE;
	static int[] P;

    public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		P = new int[N];
		for(int i = 0; i < N; i++){
			P[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(P);
		for(int i = 0; i < N; i++){
			int sum = 0;
			int count = 0;
			for(int j = 0; j < N; j++){
				int cur = P[j];
				if(i == j) cur /= 2;
				if(sum + cur <= B) {
					sum += cur;
					count++;
				} else break;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);

	}

}
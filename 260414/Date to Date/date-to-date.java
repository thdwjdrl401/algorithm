import java.io.*;
import java.util.*;

public class Main {

	static int A, B, C, D;
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	StringTokenizer st = new StringTokenizer(br.readLine());
       	int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       	A = Integer.parseInt(st.nextToken());
       	B = Integer.parseInt(st.nextToken());
       	C = Integer.parseInt(st.nextToken());
       	D = Integer.parseInt(st.nextToken());
       	int day = D - B;
       	int monthDay = 0;
       	for (int i = A; i < C; i++) {
			monthDay += days[i];
		}
       	System.out.println(monthDay + day + 1);

    }
}
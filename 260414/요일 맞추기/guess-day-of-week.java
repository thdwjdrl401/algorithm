import java.io.*;
import java.util.*;

public class Main {

	static int m1, d1, m2, d2;
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	StringTokenizer st = new StringTokenizer(br.readLine());
       	m1 = Integer.parseInt(st.nextToken());
       	d1 = Integer.parseInt(st.nextToken());
       	m2 = Integer.parseInt(st.nextToken());
       	d2 = Integer.parseInt(st.nextToken());
       	int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       	String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
       	int day1 = 0;
       	for (int i = 1; i < m1; i++) {
			day1 += days[i];
		}
       	day1 += d1;
       	
       	int day2 = 0;
       	for (int i = 1; i < m2; i++) {
			day2 += days[i];
		}
       	day2 += d2;
       	
       	System.out.println(day[((day2 - day1) % 7 + 7) % 7]);
    }
}
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
       	String checkDay = br.readLine();
       	int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       	Map<String, Integer> day = new HashMap<>();
       	day.put("Mon", 0);
       	day.put("Tue", 1);
       	day.put("Wed", 2);
       	day.put("Thu", 3);
       	day.put("Fri", 4);
       	day.put("Sat", 5);
       	day.put("Sun", 6);
       	
       	int day1 = 0;
       	for (int i = 1; i < m1; i++) {
			day1 += days[i];
		}
       	day1 += d1;
       	day1 += day.get(checkDay);
       	
       	int day2 = 0;
       	for (int i = 1; i < m2; i++) {
			day2 += days[i];
		}
       	day2 += d2;
       	int result = Math.abs(day1 - day2) / 7;
        if(day1 < day2) result ++;
       	System.out.println(result);
    }
}
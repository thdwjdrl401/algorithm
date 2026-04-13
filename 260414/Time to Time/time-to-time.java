import java.io.*;
import java.util.*;

public class Main {

	static int A, B, C, D;
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	StringTokenizer st = new StringTokenizer(br.readLine());
       	A = Integer.parseInt(st.nextToken());
       	B = Integer.parseInt(st.nextToken());
       	C = Integer.parseInt(st.nextToken());
       	D = Integer.parseInt(st.nextToken());
       	int hour = C - A;
       	int minute = D - B;
       	System.out.println(hour * 60 + minute);

    }
}
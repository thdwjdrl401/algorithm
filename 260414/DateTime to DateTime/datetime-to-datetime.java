import java.io.*;
import java.util.*;

public class Main {

	static int A, B, C;
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	StringTokenizer st = new StringTokenizer(br.readLine());
       	A = Integer.parseInt(st.nextToken());
       	B = Integer.parseInt(st.nextToken());
       	C = Integer.parseInt(st.nextToken());
       	int curTime = A * 24 * 60 + B * 60 + C;
       	int defaultTime = 11 * 24 * 60 + 11 * 60 + 11;
       	System.out.println(curTime < defaultTime ? -1 : curTime - defaultTime);

    }
}
import java.util.*;
import java.io.*;

public class Main {
    	public static void main(String args[]) throws IOException {
 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
			System.out.println("Case #" + i + ": " + m + " + " + n + " = " + (m+n));
		}
		br.close();
    }
}
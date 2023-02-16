import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int max = -1000001;
        int min = 1000001;
        
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            
            if(max < n) {
                max = n;
            }
            if(n < min) {
                    min = n;
                }
        }
        System.out.println(min + " " + max);
    }
}
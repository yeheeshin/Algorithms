import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int i = N;
        int count = 0;
        
        do {
             N = (((N/10) + (N%10)) % 10 + ((N%10)*10));
            count++;
        }
        while(i != N);
        
        System.out.println(count);
    }
}
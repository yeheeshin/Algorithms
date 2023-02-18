// 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = 0;
        int count = 0;

        for(int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if(max < num) {
                max = num;
                count = i + 1;
            }
        }
        
        System.out.println(max);
        System.out.println(count);
    }
}
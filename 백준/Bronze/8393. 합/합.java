import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = 0;
        int n = sc.nextInt();
        
        for(int i = 1; i < n+1; i++) {
            m = m + i;
        }
            System.out.println(m);
    }
}
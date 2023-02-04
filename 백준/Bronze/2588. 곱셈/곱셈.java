import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        sc.close();
        
        int b_1 = b%10;
        int b_10 = b%100/10;
        int b_100 = b/100;
                
        System.out.println(a*b_1);
        System.out.println(a*b_10);
        System.out.println(a*b_100);
        System.out.println(a*b);


    }
}
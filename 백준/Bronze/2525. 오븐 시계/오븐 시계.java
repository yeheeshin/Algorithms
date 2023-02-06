import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int min = 60*a+b;
        int total = min + c;
        
        a = total/60;
        b = total%60;
        
        if(a > 24 || a == 24) {
            a = a - 24;
            System.out.println(a + " " + b);
        } else {
            System.out.println(a + " " + b);
        }
    }
}
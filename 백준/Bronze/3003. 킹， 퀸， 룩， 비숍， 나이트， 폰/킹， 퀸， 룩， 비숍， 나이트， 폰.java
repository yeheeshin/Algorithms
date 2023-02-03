import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b,c,d,e,f;
        a = 1;
        b = 1;
        c = 2;
        d = 2;
        e = 2;
        f = 8;
        
        a = a - sc.nextInt();
        b = b - sc.nextInt();
        c = c - sc.nextInt();
        d = d - sc.nextInt();
        e = e - sc.nextInt();
        f = f - sc.nextInt();
        
        System.out.print(a + " " + b + " " + c + " " + d + " " + e + " " + f);

    }
}
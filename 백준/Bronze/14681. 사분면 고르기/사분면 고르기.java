import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        if(x > 0) {
            if(y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if(y > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}
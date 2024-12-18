class Solution {
    public static boolean solution(int x) {
        int a = 0;
        int b = x;
        
        while(b % 10 != 0) {
            a += b % 10;
            
            b = b/10;
        }
        
        a+= b/10;
        
        if(a != 0 && x % a == 0){
            return true;
        } else {
            return false;
        }
        
    }
    
    public static void main(String[] args){
        int x = 10;
        
        boolean a = solution(x);
        System.out.println(a);
    }
}
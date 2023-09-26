class Solution {
    public long solution(long n) {
        long a = 0;
        
        for(long i = 1; i <= n; i++) {
            a = n / i;
            if(a == i && n % i == 0){
                a= (a+1)*(a+1);
                break;
            } else if( i == n) {
                a = -1;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(121);
    }
}
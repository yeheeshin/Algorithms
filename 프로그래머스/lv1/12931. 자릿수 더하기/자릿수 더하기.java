import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        sol.solution(123);
    }
    
}
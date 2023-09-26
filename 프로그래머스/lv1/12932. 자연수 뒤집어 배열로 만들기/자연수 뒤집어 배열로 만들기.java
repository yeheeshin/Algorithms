class Solution {
    public int[] solution(long n) {
         String s = String.valueOf(n);
        
        int[] answer = new int[s.length()];
        
        for(int i = 0; n !=0 ; i++){
            answer[i] = (int)(n % 10);
            n = n/10;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        sol.solution(12345);
    }
    
}
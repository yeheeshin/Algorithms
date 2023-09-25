class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++) {

            if(i == 0) {
                answer[i] = x;
            } else {
                answer[i] = answer[i-1] + x;
            }
        }
        return answer;
    }
    
  public static void main(String[] args) {
         Solution sol = new Solution();
         
          System.out.println(sol.solution(2,5));
     }
}
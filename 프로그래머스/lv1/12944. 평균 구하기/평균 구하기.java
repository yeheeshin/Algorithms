class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
        }
        
        double a = (double)sum/arr.length;
        
        return a;
    }
    
     public static void main(String[] args) {
         int[] a = {1,2,3,4};
         Solution sol = new Solution();
         System.out.println("결과 : " + sol.solution(a));
     }
}
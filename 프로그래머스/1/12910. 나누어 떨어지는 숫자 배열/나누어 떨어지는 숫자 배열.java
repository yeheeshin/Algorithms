import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0){
                answer[j] = arr[i];
                j++;
            }
        }
                
        if(j == 0){
            answer[0] = -1;
            int[] result = Arrays.copyOf(answer, j+1);
             return result;
        } else{
            int[] result = Arrays.copyOf(answer, j);
            Arrays.sort(result);
             return result;
        }
        

        
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3,6,10};
        int div = 3;
        
        
        sol.solution(arr, div);
    }
    
    
}
class Solution {
    public int solution(int age) {
        int year = 2022;
        
        for(int i = age; i > 1; i--){
            year--;
        }
        return year;
    }
    
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        sol.solution(40);
    }
}
import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int a = numbers.length - 1;
        int b = numbers.length - 2;
        
        int answer = numbers[a];
        int answer2 = numbers[b];
        
        
        return (answer * answer2);
    }
}
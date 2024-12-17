import java.util.Arrays; 

class Solution {
    public long solution(long n) {
        String a = Long.toString(n);
        
        char[] a_list = a.toCharArray();
        Arrays.sort(a_list);
        
        StringBuilder sb = new StringBuilder(new String(a_list));
        sb.reverse();
        
        return Long.parseLong(sb.toString());
    }

}
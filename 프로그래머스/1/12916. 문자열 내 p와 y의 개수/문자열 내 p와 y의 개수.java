class Solution {
    boolean solution(String s) {        
        s = s.toLowerCase();
        
        int p = 0;
        int y = 0;
        
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(a == 'p'){
                p++;
            } else if(a == 'y'){
                y++;
            }
        }
        
        if(p == y){
            return true;
        } else {
            return false;
        }
    }
}
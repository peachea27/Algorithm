import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] space = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String sp : space ) {
            int num = Integer.parseInt(sp);
            max = Math.max(max , num);
            min = Math.min(min , num);
        }
        answer = min + " " + max;
        return answer;
    }
}
import java.util.*;
class Solution {
    public String solution(String s) {
        //ASCII코드 내림차순으로 정렬
        String answer = "";
        char[] charArr = s.toCharArray();
        
        Arrays.sort(charArr);
        
        StringBuilder sb = new StringBuilder(new String(charArr));
        answer = sb.reverse().toString();
        return answer;
    }
}
import java.lang.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        String last = phone_number.substring(len- 4);
        answer = "*".repeat(len-4) + last;
        
        return answer;
    }
}
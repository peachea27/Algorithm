import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        // 문자로 변경해서 모두 배열에 넣기
        String charN = Integer.toString(n);
        char[] array = charN.toCharArray();
        System.out.println(array);
        for(int i = 0; i < array.length; i++){
            int number = (int)array[i] - '0';
            answer += number;
        }
        
        

        return answer;
    }
}
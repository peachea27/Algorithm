import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        Map<Character,Integer> order = new HashMap<>();
        order.put('A',0);
        order.put('E',1);
        order.put('I',2);
        order.put('O',3);
        order.put('U',4);
        //1, 5, 5^2, 5^3, 5^4
        int[] numbers = {781,156,31,6,1};
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            answer += 1 + order.get(c)*numbers[i];
        }
        return answer;
    }
}
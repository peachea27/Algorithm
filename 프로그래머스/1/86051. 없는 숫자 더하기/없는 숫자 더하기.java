import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> arr =new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        for( int num : numbers){
          arr.removeIf(n -> num == n);
            }
        
        for(int a : arr){
            answer += a;
        }
        return answer;
    }
}
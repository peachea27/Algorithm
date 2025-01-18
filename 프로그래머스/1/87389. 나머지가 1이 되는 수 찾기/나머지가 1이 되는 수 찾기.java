import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for( int i = 1; i < n; i++){
           if( n % i == 1){
            arr.add(i);
         } 
        }
        Collections.sort(arr);
        answer = arr.get(0);
        return answer;
    }
}
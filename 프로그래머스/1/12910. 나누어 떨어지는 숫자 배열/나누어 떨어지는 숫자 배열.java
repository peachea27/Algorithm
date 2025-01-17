import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        int z = 0;
        int max = 0;
        for ( int num : arr){
           if(num % divisor == 0){
               list.add(num);
           } 
        }
       if(list.isEmpty()){
           return new int[]{-1};
       }
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for( int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        HashSet<Integer> arr = new HashSet<>();
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j<numbers.length; j++){
                arr.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[arr.size()];
        Iterator<Integer> iter = arr.iterator();
        int index = 0;
        while(iter.hasNext()){
            answer[index] = iter.next();
            index++;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
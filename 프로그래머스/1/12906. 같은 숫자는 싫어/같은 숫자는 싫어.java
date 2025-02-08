import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i <arr.length; i++){
            if(i == 0 || arr[i] != arr[i-1])
            list.add(arr[i]);
        }
        return list;
    }
}
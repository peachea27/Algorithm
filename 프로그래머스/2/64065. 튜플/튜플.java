import java.util.*;
class Solution {
    public int[] solution(String s) {
        Set<Integer> set = new LinkedHashSet<>();
        s=s.substring(2,s.length()-2);
        String[] sArr = s.split("},\\{");
        Arrays.sort(sArr,(a,b)->a.length()-b.length());
        for(String arr1: sArr){
            String[] arr2 = arr1.split(",");
            for(String a : arr2) {
            set.add(Integer.parseInt(a));   
            }
        }
        
        int[] answer = new int[set.size()];
        int i = 0;
        for(int num: set){
            answer[i++]=num;
        }
        return answer;
    }
}
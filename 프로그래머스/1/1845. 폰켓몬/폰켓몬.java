import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int kind = 0;
        HashMap<Integer,Integer> ponkemons = new HashMap<>();
        for(int num : nums){
            ponkemons.put(num, ponkemons.getOrDefault(num,0)+1);
        }
        for(int val : ponkemons.values()){
            if(val > 0) kind++;
        }
        answer = (kind >(nums.length/2))? (nums.length/2) : kind;
        return answer;
    }
}
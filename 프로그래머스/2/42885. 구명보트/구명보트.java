import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = people.length;
        int light = 0;
        int heavy = people.length-1;
        Arrays.sort(people); // asc
       
        while(heavy > light){
            if(people[light] +people[heavy] <= limit){
                light++; heavy--;
                answer--;
            }else{
                heavy--;
            }
        } 
        return answer;
    }
}
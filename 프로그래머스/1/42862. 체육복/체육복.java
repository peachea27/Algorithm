import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        HashMap<Integer,Integer> students = new HashMap<>();
        for(int i = 1; i <= n; i++){
            students.put(i,1);
        }
        for(int lo : lost){
            students.put(lo,0);
        }
        for(int re : reserve){
            students.put(re, students.get(re)+1);
        }
        for(int i = 1; i<= n; i++){
            //i가 1일때와 n일때의 예외처리 필요
            if(students.get(i) >= 1){
                answer++;
            }else{
                if((i > 1) && (students.get(i-1) ==2)){
                    answer++;
                    students.put(i-1, 1);
                }else if((i < n) && (students.get(i+1) ==2)){
                    answer++;
                    students.put(i+1,1);
                }
            }
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        //사과의 가격: 1~k, 사과상자 가격: 최저가*m, 여러상자 가능
        //0123456-3:1,4 /0123456 - 4 :3
        int answer = 0;
        Arrays.sort(score);
        int i = score.length - m;
        while(i>=0){
            answer += score[i]*m;
            i = i-m;
        }
        return answer;
    }
}
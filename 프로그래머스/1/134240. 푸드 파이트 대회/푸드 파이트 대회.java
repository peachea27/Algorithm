import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <food.length; i++) {
            //i번 음식이 food[i]개 있음.//i번 음식을 food[i]를 2로 나눈 몫만큼 반복해서 붙이기
            int many = (int)(food[i]/2);
            for (int j = 0; j < many; j++){   
             sb.append(i);
            }
        }
            StringBuilder reverse = new StringBuilder(sb).reverse(); //reverse는 스트링빌더의 객체를 뒤집으므로 sb는 뒤집힌채로 유지됨
            sb.append(0);
            sb.append(reverse);
            
            answer = sb.toString();
        return answer;
    }
}
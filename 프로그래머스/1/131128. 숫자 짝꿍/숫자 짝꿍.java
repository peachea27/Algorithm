import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        // 빈도수로 접근
        String answer = "";
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        StringBuilder sb = new StringBuilder();
        
        for(int x = 0; x < X.length(); x++) {
            //xCount[X.charAt(x)]++; //이렇게 하면 ASCII코드가 들어가서 IndexOutOfBound
            xCount[X.charAt(x)-'0']++; //등장한 빈도수 
        }
        for(int y = 0; y < Y.length(); y++ ){
            yCount[Y.charAt(y)-'0']++;
        }
        
        for(int i = 9; i >= 0; i--){
            // 숫자 i가 등장한 횟수 : i를 common번 붙이기
            int common = xCount[i] > yCount[i]? yCount[i] : xCount[i];
            for(int j = 0; j < common; j++){
                sb.append(i);
            }
        }
        answer = sb.toString();
        if(sb.length() == 0) return "-1";// 이게 먼저 와야 StringIndexOutOfBoundsException방지
        if(sb.charAt(0) == '0') return "0";
        return answer;
    }
}
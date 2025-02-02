import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n; i++){
            // nums in arr should be turned into binary
            String binary1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(" ", "0");
            String binary2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(" ", "0");

            for(int j = 0; j<n; j++){
                if(binary1.charAt(j) == '1' || binary2.charAt(j) =='1' ){
                    sb.append("#");
                }else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            sb.setLength(0);

        }
            
        return answer;
        //the wall is OR/ and the space is AND;
    }
}
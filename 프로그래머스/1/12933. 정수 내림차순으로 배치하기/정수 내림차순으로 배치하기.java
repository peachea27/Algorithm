import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String nStr = String.valueOf(n);
        long[] numArr = new long[nStr.length()];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i <nStr.length(); i++){
           numArr[i] = Character.getNumericValue(nStr.charAt(i));            
        }
      
        for (int i = 0; i < numArr.length; i++) {
            for(int j = i+1; j <numArr.length; j++){
                if(numArr[j] > numArr[i]){
                    long temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }
        
        for ( long num : numArr){
            sb.append(String.valueOf(num));
        }
        answer = Long.parseLong(sb.toString());
        return answer;
        }
    }

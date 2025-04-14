import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
      
        for(int i = 0; i < discount.length -9; i++){
            String arr[] = Arrays.copyOfRange(discount,i,i+10);
            if(checkDiscount(arr, want,number)) answer++;
        }
        
        return answer;
    }
    
    private boolean checkDiscount(String[] arr, String[] want,int[] number) {
          HashMap<String, Integer> hs = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            hs.put(want[i], number[i]);
        }

        for(String a : arr) {
            hs.put(a, hs.getOrDefault(a,0)-1);
        }
        
        for( String h : hs.keySet()) {
            if(hs.get(h) > 0) return false;
        }
        return true;
    }
}
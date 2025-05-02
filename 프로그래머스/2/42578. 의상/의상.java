import java.util.HashMap;
import java.util.Map.Entry;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        int factorial = 1;
        HashMap<String,Integer> hm = new HashMap<>();
        for(String[] cloth : clothes){
            hm.put(cloth[1],hm.getOrDefault(cloth[1],0)+1);
        }
        for(Entry<String,Integer> e : hm.entrySet()) {
            factorial *= (e.getValue()+1);
        }
        answer= factorial -1; //아무것도 입지 않은 경우의 수 1
        return answer;
    }
}
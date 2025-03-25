import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Comparator;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        
        for(int tan : tangerine ) {
            hm.put(tan, hm.getOrDefault(tan,0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> list = new LinkedList<>(hm.entrySet());
        list.sort(new Comparator<Map.Entry<Integer,Integer>>() { // desc
            @Override
            public int compare (Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2){
                return o2.getValue() - o1.getValue();
            }
        });
        for( Map.Entry<Integer,Integer> entry : list) {
            sum += entry.getValue();
            answer++;
            if(sum >= k) break;
        }
        return answer;
    }
}
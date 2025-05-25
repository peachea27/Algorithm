import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> cache = new LinkedList<>();
        
        if (cacheSize == 0) return cities.length * 5;
        
        for(String c: cities) {
            String lower = c.toLowerCase();
            if(cache.contains(lower)) {
               cache.remove(lower); 
                answer += 1;
            }else{
                answer+=5;
                if(cache.size() >= cacheSize) cache.poll();
            }
            cache.add(lower);
        }
        return answer;
    }
}
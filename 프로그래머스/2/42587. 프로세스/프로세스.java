import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;
        
        for (int priority : priorities) {
            queue.add(priority);
        }
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            boolean higher = false;
            
            for (int priority : queue) {
                if (priority > current) {
                    higher = true;
                    break;
                }
            }
            
            if (higher) {
                queue.add(current);
            } else {
                answer++;
                if (location == 0) {
                    return answer;
                }
            }
            
            location--;
            if (location < 0) {
                location = queue.size() - 1;
            }
        }
        return answer;
    }
}
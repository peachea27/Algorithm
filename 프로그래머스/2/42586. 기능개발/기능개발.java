import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int n = progresses.length;
        Stack<Integer> st = new Stack();
        for(int i = n-1; i >= 0; i--) {
            int tmp = (int)Math.ceil((100.0 - progresses[i])/speeds[i]);
            st.push(tmp);//937
        }
         while (!st.isEmpty()) {
                int pop = st.pop();
                int cnt = 1;

                while (!st.isEmpty() && pop >= st.peek()) {
                    st.pop();
                    cnt++;
                }

                answer.add(cnt);  
            }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
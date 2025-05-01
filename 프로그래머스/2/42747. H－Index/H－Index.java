import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int possible = Math.min(citations[i], n - i);
            answer = Math.max(answer, possible);
        }

        return answer;
    }
}
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int zero = 0;
        while(zero < n){
            answer[zero] = (long)x * (1+zero);
            zero++;
        }
        return answer;
    }
}
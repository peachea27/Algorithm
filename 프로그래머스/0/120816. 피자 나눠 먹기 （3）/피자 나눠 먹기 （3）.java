class Solution {
    public int solution(int slice, int n) {
        int answer = 1; //기본 한 판
        int piece = slice;
        while(piece < n) {
            answer += 1;
            piece += slice;
        }
        return answer;
    }
}
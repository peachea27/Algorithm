class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; //받을 수 있는 콜라개수

        while(n >= a) {
            int qtmp = (n /a) * b;
            answer += qtmp;
            int rtmp = n % a;           
            n = qtmp + rtmp;
        }
        
        return answer;
    }
}
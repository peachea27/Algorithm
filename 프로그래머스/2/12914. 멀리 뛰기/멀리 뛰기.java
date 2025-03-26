class Solution {
    public long solution(int n) {
        long answer = 0; // 1과 2를 사용하여 n이 되는 모든 조합의 수
        int[] fibonacci = new int[n+1];
        fibonacci[0] = 1; fibonacci[1] = 2;
        
        if(n < 3) return fibonacci[n-1];
        
        for(int i = 0; i < n-2; i++) { 
            fibonacci[i+2] = (fibonacci[i]+fibonacci[i+1]) % 1234567;
        }
        return fibonacci[n-1] % 1234567;
    }
// 피보나치 수열과 같다! 1-> 1 2-> 2 3->3 4->5 5->8
}

class Solution {
    public int solution(int n) {
        if(n % 2 != 0) return 2;
        for(int i = 3; i <= Math.sqrt(n); i++){
            if((n-1)%i == 0) return i;
        }
        return n-1;
    }
}
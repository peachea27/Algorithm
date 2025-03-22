class Solution {
    public int solution(int N) {
        int battery = 0;
        while(N>0){
            if(N % 2 == 0) N /=2;
            else {
                N -= 1;
                battery++;
            }
        }
    return battery;
    }
}
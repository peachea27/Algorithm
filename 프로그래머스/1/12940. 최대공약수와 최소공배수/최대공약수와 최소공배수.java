class Solution {
    public int[] solution(int n, int m) {
        int comDiv = 1;
        int leastMul = 1;
        for(int i = 1; i <= n; i++){
            if(n % i == 0 && m % i ==0){
                comDiv = i;
            }
        }
        for (int i = 1; i <= n*m; i++){
            if(i % n == 0 && i % m == 0){
                leastMul = i;
                break;
            }
        }
         int[] answer = {comDiv, leastMul};
        return answer;
    }
}
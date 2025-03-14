class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
        int sum = 0; 
        int no = i;
            while(sum < n ){
                sum += no;
                no++;
                if (sum == n) {
                    answer += 1;
                    break;
                }
            }
        }
        return answer;
    }
}
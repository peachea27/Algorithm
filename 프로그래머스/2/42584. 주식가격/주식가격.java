class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int n = prices.length-1;
        for(int i = 0; i <n; i++) {
            answer[i] = n-i;
            for(int j = i+1; j<prices.length; j++) {
                if(prices[i] > prices[j]){
                    answer[i] = j-i;
                    break;
                }
            }
        }
        return answer;
    }
}
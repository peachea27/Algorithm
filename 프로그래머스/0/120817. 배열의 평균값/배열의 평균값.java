class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        int nLen = numbers.length;
        for(int i = 0; i < nLen; i++){
            sum += numbers[i];
        }
        answer = (double)sum / nLen;
        
        return answer;
    }
}
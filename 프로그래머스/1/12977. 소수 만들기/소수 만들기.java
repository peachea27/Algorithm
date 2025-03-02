class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length - 2; i++) {
           for(int j = i+1; j < nums.length - 1; j++) {
               for(int k = j+1; k < nums.length; k++) {
                   boolean isPrime = true;
                   int number = nums[i] + nums[j] + nums[k]; //최소 6
                   for(int l = 2; l <= (int)Math.sqrt(number); l++) {
                       if(number % l == 0) {
                           isPrime = false;
                           break;
                       }
                   }
                   //System.out.println(number+" isPrime? "+isPrime);
                   if(isPrime) answer++;
               }
           } 
        }
        return answer;
    }
}
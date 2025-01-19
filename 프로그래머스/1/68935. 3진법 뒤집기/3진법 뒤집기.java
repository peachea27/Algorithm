class Solution {
    public int solution(int n) {
        int answer = 0;
        String s ="";
   
        while(n > 0){
             s += String.valueOf(n % 3); //0021
             n /= 3;
        }
        
        for( int i = 0; i < s.length(); i++){
           answer += (s.charAt(i)- '0') * Math.pow(3,s.length()-1-i);
        }
        
        return answer;
    }
}
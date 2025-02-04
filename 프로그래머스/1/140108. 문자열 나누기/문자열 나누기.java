class Solution {
    public int solution(String s) { //s:aaa
        int answer = 0;
        int index = 0; 
        
        while(index < s.length()){
            char x = s.charAt(index);
            int countX = 1;
            int countXx = 0;
            
            for(int i = index+1; i<s.length(); i++){
                if(x == s.charAt(i)){
                    countX++;
                }else{
                    countXx++;
                }
                
                if(countX == countXx){
                    answer++;
                    index =i+1;
                    break;
                }
            }
            
               if (countX != countXx) {
                   answer++;
                    break;
            }
            
        }
    
        return answer;
    }
}
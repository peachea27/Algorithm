class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 1; i <s.length(); i++){
            int tmp = -1;
            for(int j = 0; j < i; j++){
               if(s.charAt(i) == s.charAt(j)){
                   tmp = i - j;
               }
                answer[i] = tmp;
            }     
        }
        answer[0] = -1;
        return answer;
    }
}
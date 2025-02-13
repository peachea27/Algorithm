import java.lang.StringBuilder;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for(int i = 0; i < s.length(); i++){
           int idx = index;
           char c = s.charAt(i);
            while(idx > 0){
                c++;
                if(c > 'z') c = 'a'; 
                if(skip.indexOf(c) == -1){
                    idx--;
                }
            }
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}
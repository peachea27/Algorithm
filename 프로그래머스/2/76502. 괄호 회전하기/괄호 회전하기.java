import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        int n = s.length();
        
        if(s.length() % 2 != 0) return 0;
        
        while(count<n){
        
            if(checkEven(s)) answer++;
            s= s.substring(1,n) + s.charAt(0);
            count++;
        }
        
        return answer;
    }

    private boolean checkEven(String s) {
        Stack<Character> st = new Stack<>();
        for(Character c : s.toCharArray()) {
             if(c=='('|| c=='['||c=='{') {
                st.push(c);
             }else{
                 if(st.isEmpty()) return false;
                 Character k = st.pop();
                 if((c==')' && k !='(')||
                   (c==']' && k != '[')|| (c=='}' && k !='{')){
                     return false;
                 }
             }
        }
        return st.isEmpty();
    }
}
   
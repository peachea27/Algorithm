class Solution {
    public String solution(String myString) {
        String answer = "";
        String str = myString;
        int tmp = 0;
        for (int i = 0; i < str.length(); i++){
            tmp = (int)str.charAt(i);
            if(tmp < 108){
                tmp = 108;
            }
            answer += (char)tmp;
        }
        return answer;
    }
}
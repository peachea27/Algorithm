class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == ' ') { 
                answer.append(' '); // 공백은 그대로 유지
            } else if (Character.isUpperCase(current)) { 
                // 대문자 순환 처리
                char shifted = (char) ('A' + (current - 'A' + n) % 26);
                answer.append(shifted);
            } else if (Character.isLowerCase(current)) { 
                // 소문자 순환 처리
                char shifted = (char) ('a' + (current - 'a' + n) % 26);
                answer.append(shifted);
            }
        }
        return answer.toString();
    }
}

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String tmp = "";
        new_id = new_id.toLowerCase();
        for(int i = 0; i < new_id.length(); i++) {
            Character n = new_id.charAt(i);
                if(Character.isLetterOrDigit(n)|| n =='-' || n =='_' || n =='.'){   
                    answer+= n;
                }
            }
        //3,4단계 마침표 처리
         answer = answer.replaceAll("\\.+", ".");
        
         if (answer.startsWith(".")) {
            answer = answer.substring(1);
         }
         if (answer.endsWith(".")) {
             answer = answer.substring(0, answer.length() - 1);
         }
        //5단계 빈문자일때 a넣기
         if (answer.isEmpty()) {
            answer = "a";
        }
        //6단계 15문자
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            if (answer.endsWith(".")) {
                answer = answer.substring(0, 14);
            }
        }
        //7단계 2자 이하
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
        return answer;
    }
}
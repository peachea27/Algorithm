import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        //Strings[i].charAt(n) : n번째 문자들을 비교해서 Strings[i] 정렬
        Arrays.sort(strings,(s1,s2) -> {
            if(s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2); //비교값 기준  반환
            }else{   
            return Character.compare(s1.charAt(n),s2.charAt(n));
            }
        });
       
        //인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
        answer = strings;
        return answer;
    }
}
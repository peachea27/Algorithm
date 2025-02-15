import java.lang.StringBuilder;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==' ') {idx = -1;}
            if(idx % 2 == 0) sb.append(Character.toUpperCase(s.charAt(i)));
            else sb.append(Character.toLowerCase(s.charAt(i)));
            idx++;
        }
        String answer = sb.toString();
        return answer;
    }
}
        //--정확도 68퍼. 중간 공백이 두개이거나 뒤에 공백하나를 뺴는데서 오류가 생겼을 수도 있음
        // String[] StringSet = s.split(" "); 
        // for( String str : StringSet ){
        //     for(int i = 0; i <str.length(); i++){
        //         if(i % 2 == 0) {sb.append(Character.toUpperCase(str.charAt(i)));
        //         else sb.append(Character.toLowerCase(str.charAt(i)));
        //     }
        //     sb.append(" ");
        // }
        // sb.deleteCharAt(sb.length()-1);
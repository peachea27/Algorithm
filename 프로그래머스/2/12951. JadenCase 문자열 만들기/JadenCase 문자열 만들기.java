import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArr = s.toLowerCase().split(" ",-1); // 공백 보존: 빈문자열 포함 모두 배열에 포함
        for(String st : sArr) {
            if(st.length() > 0){
                if(!Character.isDigit(st.charAt(0))) {
                    sb.append(Character.toUpperCase(st.charAt(0)));
                    sb.append(st.substring(1));
                }else {
                    sb.append(st);
                }   
            }
                sb.append(" "); //위치 이동
        }
        if(sb.length() > 0) sb.setLength(s.length()); //맨끝을 무조건 자르는게 아니라 s길이봐서
        return sb.toString();
    }
}

//정확성 44.4 런타임에러

      // StringBuilder sb = new StringBuilder();
      //   String answer = "";
      //   String[] sArr = s.toLowerCase().split(" ");
      //   for(String st : sArr) {
      //       if(!Character.isDigit(st.charAt(0))) {    // 여기서 런타임에러가 발생
//연속된 공백이나 끝에 공백이 있을시 st는 빈문자열임
      //           sb.append((char)(st.charAt(0)-32));
      //           sb.append(st.substring(1) + " ");
      //       }else {
      //           sb.append(st + " ");
      //       }
      //   }
      //   answer = sb.toString().trim();
      //   return answer;

// st의 길이 체크 추가
//정확성 44.4 런타임 오류 -> 그냥 실패

        // StringBuilder sb = new StringBuilder();
        // String answer = "";
        // String[] sArr = s.toLowerCase().split(" ");
        // for(String st : sArr) {
        //     if(st.length() > 0){
        //         if(!Character.isDigit(st.charAt(0))) {
        //             sb.append((char)(st.charAt(0)-32));
        //             sb.append(st.substring(1) + " ");
        //         }else {
        //             sb.append(st + " ");
        //         }        
        //     }
        // }
        // answer = sb.toString().trim();
        // return answer;
    
// 정확성 44.4 
// split에 -1 / trim 대신 sb 마지막 자르기
        // StringBuilder sb = new StringBuilder();
        // String[] sArr = s.toLowerCase().split(" ",-1); // 공백 보존: 빈문자열 포함 모두 배열에 포함
        // for(String st : sArr) {
        //     if(st.length() > 0){
        //         if(!Character.isDigit(st.charAt(0))) {
        //             sb.append(Character.toUpperCase(st.charAt(0)));
        //             sb.append(st.substring(1));
        //         }else {
        //             sb.append(st);
        //         }   
        //         sb.append(" ");
        //     }
        // }
        // if(sb.length() > 0) sb.setLength(sb.length()-1); //trim말고 맨 끝만 자르기
        // return sb.toString();
    
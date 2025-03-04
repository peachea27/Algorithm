import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> p = new HashMap<>(); //Set에 넣어서 점수 카운트
        //choices 1:L3점 2:L2점 3:L3점 4:0 5:R1점 6:R2점 7:R3점
        for(int i = 0; i < choices.length; i++){
            String s = survey[i];
            if(choices[i] == 2) p.put(s.charAt(0),p.getOrDefault(s.charAt(0),0)+2);
            if(choices[i] == 3) p.put(s.charAt(0),p.getOrDefault(s.charAt(0),0)+1);
            if(choices[i] == 5) p.put(s.charAt(1),p.getOrDefault(s.charAt(1),0)+1);
            if(choices[i] == 6) p.put(s.charAt(1),p.getOrDefault(s.charAt(1),0)+2);
            if(choices[i] == 1) p.put(s.charAt(0),p.getOrDefault(s.charAt(0),0)+3);
            if(choices[i] == 7) p.put(s.charAt(1),p.getOrDefault(s.charAt(1),0)+3);
        }
      
        if(p.getOrDefault('T',0) > p.getOrDefault('R',0)) sb.append("T"); else sb.append("R");
        if(p.getOrDefault('F',0) > p.getOrDefault('C',0)) sb.append("F"); else sb.append("C");
        if(p.getOrDefault('M',0) > p.getOrDefault('J',0)) sb.append("M"); else sb.append("J");
        if(p.getOrDefault('N',0) > p.getOrDefault('A',0)) sb.append("N"); else sb.append("A");
        return sb.toString();
    }
}
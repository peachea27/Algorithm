import java.util.regex.*; //그냥 java.util.*로는 안되네;;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        int[] gets = new int[3];
      
        Pattern pattern = Pattern.compile("(\\d{1,2})([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);
        
        while(matcher.find()){
            int score = Integer.parseInt(matcher.group(1));
            String power = matcher.group(2);
            String bonus = matcher.group(3);
            //power
            if(power.equals("S")) score = score;
            if(power.equals("D")) score = (int)Math.pow(score,2);
            if(power.equals("T")) score = (int)Math.pow(score,3);
          
            //bonus
            if(bonus.equals("*")){
                score = score * 2;
                if(index > 0){
                    gets[index-1] = gets[index-1]* 2;
                }
            }else if(bonus.equals("#")){
                score = score * -1;
            }
            
            gets[index++] = score;
        }
        answer = gets[0] + gets[1] + gets[2];
        
        return answer;
        //3chances/ 0~10point/ Area: s:point^1, d:point^2, t:triple^3 one on each point section
        // * # at most one on each point section
        // * : this and last point;*2 -if first turn; thispoint*2 // in a row *4
        // # :- this point  # + * = (- point)*2
    }
}
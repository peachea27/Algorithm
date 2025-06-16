import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = ""; 
        String[] strings = new String[numbers.length];
        for(int i = 0; i<numbers.length; i++) {
          strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings,new Comparator<String>(){
                   @Override
                   public int compare(String a, String b){
                       return (b+a).compareTo(a+b);
                   }
                   });
        
        if(strings[0].equals("0")) return "0";
        
        for(String s : strings) {
            answer+=s;
        }
        return answer;
    }
}
import java.util.HashMap;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashMap<String,Integer> said = new HashMap<>();
        said.put(words[0],0);
        for(int i = 1; i < words.length; i++) {
            int person = (i % n) + 1;
            int turn = i / n + 1;
            
            if(said.containsKey(words[i])){
                return new int[]{person, turn};
            }
            else if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                return new int[]{person, turn};
            }else{// 21단어, 3명/ 10번째 단어에서 틀리면 10%3번째 사람
                said.put(words[i],0);
            }
        }
        return answer;
    }
}
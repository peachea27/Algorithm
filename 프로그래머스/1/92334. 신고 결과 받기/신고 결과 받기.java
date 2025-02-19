import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String,HashSet<String>> reportMap = new HashMap<>();
        for( String s : report) {
            String[] whowhom = s.split(" ");
            HashSet<String> reporters = reportMap.getOrDefault(whowhom[1], new HashSet<>());
            reporters.add(whowhom[0]);
            reportMap.put(whowhom[1],reporters);
        }
        
        for( HashSet<String> set : reportMap.values() ) {
            if(set.size() >= k) {
                for(String name : set) {
                    for( int i = 0; i < id_list.length; i++){
                        if(name.equals(id_list[i])) answer[i]++;                     
                    }
                }
            }
        }
        
        
        return answer;
    }
}
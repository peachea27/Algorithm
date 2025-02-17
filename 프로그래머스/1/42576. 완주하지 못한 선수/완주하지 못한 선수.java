import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map <String,Integer> hm = new HashMap<>();
        for ( String name : participant){
            hm.put(name, hm.getOrDefault(name, 0)+1);
        }
        for( String name: completion){
            hm.put(name, hm.get(name)-1);
        }
        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            if(entry.getValue() != 0){
                answer = entry.getKey();
            }
        }
        return answer;
    }
}

// -- 정확성 58.3(시간초과)

//       String answer = "";
//         ArrayList<String> list = new ArrayList<>();
        
//         for( String name : participant){
//             list.add(name);
//         }
//         for (String winner : completion){
//             list.remove(winner);
//         }
//         answer = list.get(0);
//         return answer;


// -- x와 중복되는 y를 모두 지워버림

//    String answer = "";
//         String[] left =  Arrays.stream(participant)
//             .filter(x -> Arrays.stream(completion).noneMatch(y -> y.equals(x)))
//             .toArray(String[]::new);
//         answer = left[0];
//         return answer;


// -- 시간초과

//  String answer = "";
//         ArrayList<String> participants = new ArrayList<>(Arrays.asList(participant));
        
//         for(String name : completion){
//             participants.remove(name);
//         }
//         answer = participants.get(0);
//         return answer;


// -- 시간초과

//  String answer = "";
//         ArrayList<String> participants = new ArrayList<>(Arrays.asList(participant));
        
//         for(int i = 0; i < completion.length; i++){
//             participants.remove(completion[i]);
//         }
//         answer = participants.get(0);
//         return answer;
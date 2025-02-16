class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length; i++){
            int sum = 0;
            boolean isPossible = true;
            for(int j = 0; j < targets[i].length(); j++){
                int min = Integer.MAX_VALUE;
                for(int k = 0; k < keymap.length; k++){
                   int index =  keymap[k].indexOf(targets[i].charAt(j));
                    if(index != -1){
                        min = Math.min(min, index + 1);
                    }
                }
                if(min == Integer.MAX_VALUE){
                    isPossible = false;
                    break;
                }
                sum += min;
            }
            answer[i] = isPossible? sum : -1;
        }
        return answer;
    }
}
       //-- 정확도 56
        // int[] answer = new int[targets.length];
        // // 배열마다 타겟의 각 문자를 찾아서, 그 문자의 가장 낮은 인덱스끼리 더하기?
        // for(int i = 0; i <targets.length; i++){ //target의 배열의 개수
        //     for (int j = 0; j < targets[i].length(); j++){//target에 있는 각 알파벳 = target[i].(j)
        //         int min = 0;
        //         for (int k = 0; k <keymap.length; k++){
        //             for (int l = 0; l <keymap[k].length(); l++){
        //                 if(targets[i].charAt(j) == keymap[k].charAt(l)){
        //                    if(min > l+1 || min == 0) min = l+1;
        //                 }
        //             }
        //         }
        //         answer[i] += min;
        //     }
        //     if(answer[i] == 0) answer[i] = -1;
        // }
        // return answer;


//-- 정확도 56
// int[] answer = new int[targets.length];
//         for(int i = 0; i < targets.length; i++){
//             int sum = 0;
//             boolean isPossible = false;
//             for(int j = 0; j < targets[i].length(); j++){
//                 int min = Integer.MAX_VALUE;
//                 for(int k = 0; k < keymap.length; k++){
//                    int index =  keymap[k].indexOf(targets[i].charAt(j));
//                     if(index != -1){
//                         min = Math.min(min, index + 1);
//                         isPossible = true;
//                     }
//                 }
//                 sum += min;
//             }
//             answer[i] = isPossible? sum : -1;
//         }
//         return answer;
    
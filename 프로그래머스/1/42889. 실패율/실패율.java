import java.util.*;
class Solution { // 2번 스테이지에 머무른 사람 = 1번을 통과한 사람
    public int[] solution(int N, int[] stages) {
     int[] answer = new int[N];
        int[] onStage = new int[N + 2]; 
        int[] passed = new int[N + 2]; 

        for (int s : stages) {
            onStage[s]++;
        }

        passed[N + 1] = onStage[N + 1];
        for (int i = N; i >= 1; i--) {
            passed[i] = passed[i + 1] + onStage[i];
        }

        double[] failure = new double[N + 1];
        for (int i = 1; i <= N; i++) {
            if (passed[i] == 0) {
                failure[i] = 0;
            } else {
                failure[i] = (double) onStage[i] / passed[i];
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        Collections.sort(list, (a, b) -> Double.compare(failure[b], failure[a]));
        
        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

//정확성 55.6

    // int[] answer = new int[N];
    //         int[] onStage = new int[N], passed = new int[N];
    //         double[] failure = new double[N];
    //         for(int s : stages ) {
    //             if(s < N+1){
    //                 onStage[s-1]++;
    //                 if(s > 1){
    //                     for(int i = 0; i < s; i++) {
    //                         passed[i]++;
    //                     }
    //                 }
    //             }else{
    //                  for(int i = 0; i < N; i++) {
    //                         passed[i]++;
    //                     }
    //             }
    //         }
    //         //실패율 계산
    //         for(int i = 0; i < N; i++){
    //             if(passed[i] == 0) failure[i] =0;
    //             else failure[i] = (double)onStage[i]/passed[i];
    //         }
    //         HashMap<Integer,Double> hash = new HashMap<>();

    //         for(int i = 0; i < N; i++) {     
    //              hash.put(i,failure[i]);
    //         }
    //         //value순서로 정렬
    //         List<Integer> list = new ArrayList<>(hash.keySet());
    //         Collections.sort(list,(value1,value2)->(hash.get(value2)).compareTo(hash.get(value1)));

    //         for(int i= 0; i < N; i++){
    //             answer[i] = list.get(i) + 1;
    //         }

    //         return answer;
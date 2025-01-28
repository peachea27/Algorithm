import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] winners = new int[k];
        Arrays.fill(winners, Integer.MAX_VALUE); // 초기값을 최대값으로 설정
        int[] worst = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                winners[i] = score[i];
                Arrays.sort(winners); 
            } else if (score[i] > winners[0]) {
                winners[0] = score[i];
                Arrays.sort(winners); 
            }
            worst[i] = winners[0];
        }

        return worst;
    }
}
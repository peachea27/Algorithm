import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for ( int k = 0; k < commands.length; k++){
                int[] arr = Arrays.copyOfRange(array, commands[k][0]-1, commands[k][1]);
                Arrays.sort(arr);
                int a = arr[commands[k][2] - 1];
                answer[k] = a;
        }
        
        return answer;
    }
}
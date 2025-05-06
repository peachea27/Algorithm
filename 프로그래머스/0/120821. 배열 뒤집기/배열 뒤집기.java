class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int n = num_list.length -1;
        for(int i = n; i >=0; i--) {
            answer[Math.abs(n-i)] = num_list[i];
        }
        return answer;
    }
}
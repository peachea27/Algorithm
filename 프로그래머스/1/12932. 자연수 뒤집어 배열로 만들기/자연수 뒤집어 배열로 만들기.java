class Solution {
    public int[] solution(long n) {
        int a = String.valueOf(n).length();
        int[] answer = new int[a];
        int cnt = 0;
        while(n>0){
            int num = (int)(n%10);
            answer[cnt++] = num;
            n /= 10;
        }
        return answer;
    }
}
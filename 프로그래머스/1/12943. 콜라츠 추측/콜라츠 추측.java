class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while (n != 1) {
            if (answer >= 500) return -1; 
            answer++;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            //int는 최대 2,147,483,647: *3할때 int범위 초과.
            //long사용
        }

        return answer;
    }
}
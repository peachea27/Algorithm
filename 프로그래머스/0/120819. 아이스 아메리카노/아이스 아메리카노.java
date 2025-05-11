class Solution {
    public int[] solution(int money) {
        int value = money/5500;
        int remain = money % 5500;
        int[] answer = {value, remain};
        return answer;
    }
}
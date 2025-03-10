class Solution {
    public int solution(int n, int k) {
        int drink = k - n/10;
        int answer = 12000*n + 2000 * drink;
        return answer;
    }
}
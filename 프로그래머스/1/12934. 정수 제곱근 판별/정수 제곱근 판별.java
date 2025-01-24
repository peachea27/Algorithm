class Solution {
    public long solution(long n) {
        long answer = 0;
        long square = (long)Math.sqrt(n);
        if(square * square == n) {
            return (square + 1)*(square + 1);
        }
        return -1;
    }
}
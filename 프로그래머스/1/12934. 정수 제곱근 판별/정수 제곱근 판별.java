class Solution {
    public double solution(long n) {
        double sq = Math.sqrt(n);
        return (sq%1 == 0)? Math.pow((double)sq+1,2):-1;
    }
}
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        //n = 3 // 123 223 333 1:[0,0] 2:[0,1][1,0][1,1] 3:[0,2][1,2][2,0][2,1][2,2] 
        //n= 4 // (i/n=0)1234 (i/n=1)2234 (i/n=2)3334 (i/n=3)4444// ++ 4,8,9,12,13,14
        //               0123        4567        891011      11121314
        for(long i = left; i < right+1; i++) {
            answer[(int)(i-left)] = (int)(i % n) + 1;
            if(i/n > i%n)  answer[(int)(i-left)] = (int)(i/n+1);
        }     
        return answer; 
    }
}
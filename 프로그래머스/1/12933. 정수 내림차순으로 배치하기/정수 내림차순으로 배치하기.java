import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] sp = Long.toString(n).split("");
        int count = sp.length - 1;
        Arrays.sort(sp);
        while(count >= 0){
            answer += Integer.parseInt(sp[count])*Math.pow(10,count);
            count--;
        }
        return answer;
        }
    }

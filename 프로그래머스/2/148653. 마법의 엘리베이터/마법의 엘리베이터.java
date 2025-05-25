class Solution {
    public int solution(int storey) {
        int answer = 0;
        while(storey > 0) {
            int lastnum = storey % 10;
            storey /= 10;
            if(lastnum > 5) {
                answer += 10-lastnum;
                storey++;
            }else if(lastnum == 5) {
                if(storey % 10 > 4){
                    answer+= 10-lastnum;
                    storey++;
                }else{
                    answer += lastnum;
                }
            }else{
                answer += lastnum;
            }
        }
        return answer;
    }
}
class Solution {
    public long solution(int price, int money, int count) {
        long fee = 0;
 
        for(int i = 1; i <= count; i++){
            fee += price * i;
        }
        
        long answer = fee - money;
        
        return answer > 0? answer : 0;
    }
}
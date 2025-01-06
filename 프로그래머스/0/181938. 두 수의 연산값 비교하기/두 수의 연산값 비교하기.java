class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int answerA = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int answerB = 2 * a * b;
        if ( answerA < answerB){
            answer = answerB;
        }else{
            answer = answerA;
        }
        return answer;
    }
}
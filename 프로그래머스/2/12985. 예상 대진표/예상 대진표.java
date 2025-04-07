import java.lang.Math;
class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        //토너먼트를 몇번해야 하는가? remain =2가 될때까지 n/2반복
        //4번이 이기면 2번으로, 7번이 이기면 4번으로 -> 2번이 이기면 1번으로,4번이 이기면 2번으로
        while(Math.abs(a-b) != 1 || Math.max(a,b) % 2 != 0) { //만약 a=2 b=3이라면? //a와 b 중 더 큰 수가 짝수!
            a= Math.round(a/2f);
            b= Math.round(b/2f);
            System.out.println(a +":"+ b);
            answer++;
        }

        return answer;
    }
}
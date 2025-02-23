import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length-i-1];
        }
        return answer;
    }
}
//효율성 15.2 시간초과

  // {
  //       int answer = 0;
  //       Integer[] listB = Arrays.stream(B).boxed().toArray(Integer[]::new);
  //       Arrays.sort(A);
  //       Arrays.sort(listB, Collections.reverseOrder());
  //       for(int i = 0; i < A.length; i++) {
  //           answer += A[i] * listB[i];
  //       }
  //       return answer;
  //   }
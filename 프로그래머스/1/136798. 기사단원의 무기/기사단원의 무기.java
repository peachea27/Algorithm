class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int j = 1; j <= number; j++) {
            int count = 0;
            for (int i = 1; i * i <= j; i++) {
                if(i*i == j) count++;
                else if(j % i == 0) count += 2;
            }
            answer += count > limit? power : count;
        }
        return answer;
    }
}

// 정확성 66.7 시간초과

//       int answer = 0;
//         for ( int i = 1; i <= number; i++ ) {
//             int count = 0;
//             for(int j = 1; j <= i ; j++) {
//                 if(i % j == 0) count++;
//             }
//             answer += count > limit? power : count;
//         }
        
//         return answer;
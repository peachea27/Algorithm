class Solution {
    public int solution(int n) {
        int answer = 2;
        if( n == 2 ) return 1;
        if( n == 3 ) return 2;
        for (int i = 4; i <= n; i++) {
            int count = 0;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) count++;
                if(count > 0) break;
            }
            if(count == 0) answer++;
        }

        return answer;
    }
}

//정확성 6.3

        // int answer = 2; // 2,3기본
        // if( n == 2 ) return 1;
        // if( n == 3 ) return 2;
        // for (int i = 4; i <= n; i++) {
        //     int count = 0;
        //    for(int j = 2; j <= Math.sqrt(n); j++) {
        //        if(i % j == 0) count++;
        //    }
        //     if(count == 0) answer++;
        // }
        // return answer;

//시간초과

//         int answer = 0;
//         for (int i = 2; i <= n; n++) {
//             int count = 0;
//             for(int j = 1; j <= Math.sqrt(n); j++) {
//                 if(i % j == 0) count++;
//             }
//             if(count == 1) answer++;
//         }

//         return answer;
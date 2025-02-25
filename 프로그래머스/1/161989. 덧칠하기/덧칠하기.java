class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int painted = 0;
        for ( int sec : section ) {
            if(painted < sec){
                painted = sec + m -1; 
                answer++;
            }
        }
        return answer;
    }
}
// 정확성 54.0

//         int answer = 0;
//         int width = section[section.length-1] - section[0] + 1;
//         answer = (int)Math.ceil((double)width/m);
//         return answer;

// 정확성 54.0 벽을 구역별로 나눔

        // int answer = 0;
        // int wall = 1;
        // for(int i = 0; i < section.length-1; i++) {
        //     if(section[i+1] -section[i] <= m) { // m보다 작거나 같으면 같은 구역
        //       wall += section[i+1]-section[i];
        //     }else {
        //         i = i + 1;
        //         wall++;
        //     }
        // }
        // answer = (int)Math.ceil((double)wall/m);
        // return answer;



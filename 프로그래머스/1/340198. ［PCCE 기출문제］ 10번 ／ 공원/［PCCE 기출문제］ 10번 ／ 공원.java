import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        //배열들의 인덱스가 일치하는 것이 몇 번 연속 -1인지? = 세로길이
        //한 배열에서 몇번 연속 -1이 나오는지? = 가로길이
        Arrays.sort(mats);
        
        for(int m = mats.length-1; m >= 0; m-- ){
            int mat = mats[m];
            for(int i = 0; i <= park[0].length-mat; i++) {
                for(int j = 0; j <= park.length-mat; j++) {
                    boolean isOccupied = true; // 여기서 초기화시켜줘야 함
                    for(int k = i; k < i+mat; k++) {
                        for(int l = j; l < j+mat; l++) {
                            if(!park[l][k].equals("-1")) {
                                isOccupied = false;
                                break;
                            }
                        }
                         // if (!isOccupied) break;
                    }
                if(isOccupied) return mat;
                }
            }
        }
        return answer;
    }
}

// 정확성 30

//         int answer = -1;
//         //배열들의 인덱스가 일치하는 것이 몇 번 연속 -1인지? = 세로길이
//         //한 배열에서 몇번 연속 -1이 나오는지? = 가로길이
       
//         for(int m : mats) {
//             for(int i = 0; i <= park[0].length-m; i++) {
//                 for(int j = 0; j <= park.length-m; j++) {
//                     boolean isOccupied = true; // 여기서 초기화시켜줘야 함
//                     for(int k = i; k < i+m; k++) {
//                         for(int l = j; l < j+m; l++) {
//                             if(!park[l][k].equals("-1")) {
//                                 isOccupied = false;
//                                 break;
//                             }
//                         }
//                     }
//                 if(isOccupied) return m;
//                 }
//             }
//         }
//         return answer;
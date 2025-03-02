import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        ArrayList<int[]> list = new ArrayList();
        int index = 0; // code
        if(ext.equals("date")) index = 1;
        if(ext.equals("maximum")) index =2;
        if(ext.equals("remain")) index = 3;
        
        for ( int i = 0; i < data.length; i++) {
            if(data[i][index] < val_ext) list.add(data[i]);
        }
        int sort = 0; // code
        if(sort_by.equals("date")) sort = 1;
        if(sort_by.equals("maximum")) sort =2;
        if(sort_by.equals("remain")) sort = 3;
        
        int[][] arr = list.toArray(new int[list.size()][4]);
        
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++){ 
                if(arr[i][sort] > arr[j][sort]) {
                    int[] tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        answer = arr;
        
        return answer;
    }
}

// 정확성 4.0

//         int[][] answer = {};
//         ArrayList<int[]> list = new ArrayList();
//         int index = 0; // code
//         if(ext.equals("date")) index = 1;
//         if(ext.equals("maximum")) index =2;
//         if(ext.equals("remain")) index = 3;
//         for ( int i = 0; i < data.length; i++) {
//             if(data[i][index] < val_ext) list.add(data[i]);
//         }
//         int sort = 0; // code
//         if(sort_by.equals("date")) sort = 1;
//         if(sort_by.equals("maximum")) sort =2;
//         if(sort_by.equals("remain")) sort = 3;
        
//         int[][] arr = list.toArray(new int[list.size()][4]);
        
//         for(int i = 0; i < arr.length-1; i++) { //아 예시문제만 보고 풀다보니 정렬이 잘못됨
//             if(arr[i][sort] > arr[i+1][sort]) {
//                 int[] tmp = arr[i];
//                 arr[i] = arr[i+1];
//                 arr[i+1] = tmp;
//             }
//         }
//         answer = arr;
        
//         return answer;
class Solution {
    public int solution(int[] arr) {
        int last = arr[arr.length-1];//최소공배수 후보
        while(true){
        boolean bool = true;
            for(int i = 0; i < arr.length-1; i++) {
                if(last % arr[i] != 0) {
                    last+= arr[arr.length-1];
                    bool=false;
                    break;
                }
            }
            if(bool) break;
        }
        return last;
    }
}
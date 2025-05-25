class Solution {
    public int explore(int k, int[][] dungeons) {
        int life = k;
        int count = 0;
        for(int[] d : dungeons) {
            if(life >= d[0]) {
                int tmp = d[0];
                d[0] =5555;
                count = Math.max(1+explore(life-d[1], dungeons),count);
                d[0] = tmp;
            }
        }
        return count;
    }
    
    public int solution(int k, int[][] dungeons) {      
        return explore(k,dungeons);
    }
    
    
}
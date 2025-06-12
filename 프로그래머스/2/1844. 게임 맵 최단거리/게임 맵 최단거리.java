import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        int[] upDown = {1,-1,0,0};
        int[] leftRight ={0,0,1,-1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});
        int lasty = maps[0].length-1; int lastx = maps.length-1;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll(); // queue 안에 있는 첫번째 좌표
            int ax = current[0]; int ay = current[1];
            
            for(int i = 0; i < 4; i++){
                int x = ax + leftRight[i];
                int y = ay + upDown[i];
                
                if(x < 0 || y < 0 || x > lastx || y > lasty) continue;
                
                if(maps[x][y] == 1){
                maps[x][y] = maps[ax][ay] +1;
                queue.offer(new int[]{x,y});
                }
                
                if(x == lastx && y == lasty) return maps[x][y];
            }
            
        }
        
        return answer;
    }
}
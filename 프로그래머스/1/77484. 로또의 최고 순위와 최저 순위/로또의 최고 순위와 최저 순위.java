class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int countZ = 0;
        
        for (int lotto : lottos){
            if(lotto == 0) countZ++;
            for(int num : win_nums){
                if(num == lotto) count++;
            }
        }
      if(count == 6) {answer[0]=1; answer[1] =1;}
      if(count == 5) {answer[1] = 2;answer[0] = answer[1]-countZ; }
      if(count == 4) {answer[1] = 3;answer[0] = answer[1]-countZ; }
      if(count == 3) {answer[1] = 4;answer[0] = answer[1]-countZ; }
      if(count == 2) {answer[1] = 5;answer[0] = answer[1]-countZ; }
      if(count == 1) {answer[1] = 6;answer[0] = answer[1]-countZ; }
      if(count == 0 && countZ == 6) {answer[1] = 6;answer[0] = 1; }
      if(count == 0 && countZ != 6) {answer[1] = 6;answer[0] = answer[1]-countZ; }
    
        return answer;
    }
}
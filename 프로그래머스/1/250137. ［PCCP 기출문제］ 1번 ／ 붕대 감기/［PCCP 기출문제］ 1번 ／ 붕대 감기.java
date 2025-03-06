import java.util.HashMap;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int status = health;
        int count = 0;
        int lastAttackTime = attacks[attacks.length-1][0]; //11초
        HashMap<Integer,Integer> attackMap = new HashMap<>();
        
        for(int i = 0; i < attacks.length; i++) {
            attackMap.put(attacks[i][0], attacks[i][1]);
        }
        
        for(int i = 0; i <= lastAttackTime; i++) { //시간 흘러가는 중
            if(attackMap.get(i) != null){
                status = status - attackMap.get(i);
                count = 0;
                System.out.println("공격 i: " + i+" status:"+ status +" count:"+count);
            }else{
                status = status + bandage[1];
                count++;
                if(count == bandage[0] && i != 0) {
                    count = 0;
                    status = status + bandage[2];
                    System.out.println("콤보 count:"+ count+ " status: "+status);
                }
                if(status > health) status = health;
                System.out.println("회복 i: " + i+" status:"+ status+ " count: "+count);
            }
            if(status <= 0) return -1;
        }
        return status;
    }
}
import java.util.HashSet;
import java.util.Set;
class Solution {
    Set<Integer> hs = new HashSet<>();
    public int solution(String numbers) {
        dfs("",numbers);
        
        int answer = 0;
        for(int a : hs){
            if(check(a)) answer++;
        }
        return answer;
    }
    
    public void dfs(String newNum, String left){
        if(!newNum.equals("")) hs.add(Integer.parseInt(newNum));
        
        for(int i = 0; i< left.length(); i++){
            dfs(newNum + left.charAt(i), left.substring(0,i)+left.substring(i+1));
        }
    }
    
    public boolean check(int number){
        if(number <= 1) return false;
        if(number == 2) return true; // 2 꼭 추가해주기
        if(number % 2 == 0) {
            return false;
        }
       for(int i = 3; i <= Math.sqrt(number); i+=2){
           if(number % i == 0) return false;
       }
        return true;
    }
}
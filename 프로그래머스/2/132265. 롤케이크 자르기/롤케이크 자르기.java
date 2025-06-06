import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashSet<Integer> a = new HashSet<>();
        HashMap<Integer,Integer> b = new HashMap<>();
        
        for(int t : topping) {
            b.put(t,b.getOrDefault(t,0)+1);
        }
        
        for(int top : topping){
            a.add(top);
            b.put(top,b.get(top)-1);
            
            if(b.get(top) <1) b.remove(top);
            if(a.size() == b.size()) answer++;
        }       
        return answer;
    }
    
    public int countNum(Queue<Integer> arr) {
        HashSet<Integer> hs = new HashSet<>();
        for( int a : arr){
            hs.add(a);
        }
        return hs.size();
    }
}
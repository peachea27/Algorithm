import java.util.HashSet;
import java.lang.System;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> hs = new HashSet<>();
        int[] copyEle = new int[elements.length*2];
        System.arraycopy(elements,0,copyEle,0,elements.length);
        System.arraycopy(elements,0,copyEle,elements.length,elements.length);
        //elements[0]/ elements[0]+elements[1]/elements[0]+elements[1]+elements[2]
        for(int i = 0; i <elements.length; i++) {//시작번호
            for(int j = 0; j <elements.length; j++) {//더하는 횟수
                int cnt = 0;
                int tmp = 0;
                int index = i;
                while(cnt <= j){
                  tmp += copyEle[index++];
                  cnt++;
                }   
                hs.add(tmp);
            }
        }
        answer = hs.size();
        return answer;
    }
}
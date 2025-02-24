import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        int[] scores = new int[3];
        int index = 0;
        
        for (int i = 0; i < answers.length; i++) {
           if(answers[i] == first[i % first.length]) scores[0]++;
           if(answers[i] == second[i % second.length]) scores[1]++;
           if(answers[i] == third[i % third.length]) scores[2]++;
        }   
        int[] copy ={scores[0], scores[1], scores[2]};
        Arrays.sort(copy);
        for(int i = 0; i < scores.length; i++){
            if(copy[2] == scores[i]) answer.add(i+1);
        }  
           
        return answer;
    }
}
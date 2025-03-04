import java.util.*;
class Solution {//LinkedList: 순서대로, 끝에서부터 없앨때 빠름 //stack : LIFO
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Deque<Integer> basket = new ArrayDeque<>(); //stack은 레거시 클래스라 deque가 BETTER!
        for(int move : moves) {// 움직일때마다
            for(int i = 0; i < board.length; i++) {//인형의 층수
                int theDoll = board[i][move-1];
                if(theDoll != 0){
                    System.out.print("/"+theDoll+" ");
                    if(!basket.isEmpty() && basket.peek() == theDoll){
                        basket.pop();
                        answer+= 2;
                    }else{
                        basket.push(theDoll); //add를 push로 바꿈
                    }
                        board[i][move-1] = 0;
                        break;
                }
            }
        }
        System.out.println(basket);
        return answer;
    }
}

//정확성 9.1

    // int answer = 0;
    //     Stack<Integer> basket = new Stack<>();
    //     for(int move : moves) {// 움직일때마다
    //         for(int i = board.length; i > 0; i--) {//인형의 층수
    //             int theDoll = board[i-1][move-1];
    //             if(theDoll != 0){
    //                 if(!basket.empty() && basket.peek() == theDoll){
    //                     basket.pop();
    //                     answer+= 2;
    //                 }else{
    //                     basket.add(theDoll); 
    //                 }
    //                     break;
    //             }
    //         }
    //     }
    //     return answer;
    
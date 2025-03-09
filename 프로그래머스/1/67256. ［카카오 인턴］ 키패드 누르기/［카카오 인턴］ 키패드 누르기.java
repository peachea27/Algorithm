class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] left = {0,3}, right = {2,3};
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 3 == 1) {
                answer+="L"; left[0] = 0; left[1] = numbers[i] / 3; 
            }else if(numbers[i] != 0 && numbers[i] % 3 == 0) {
                answer += "R"; right[0] = 2; right[1] = numbers[i] / 3 - 1;
            }else{// 가운데줄 숫자들
                int index = (numbers[i] == 0)? 3 : numbers[i] / 3;
                int leftFrom = (left[0] == 1)? Math.abs(index - left[1]) -1 :Math.abs(index - left[1]); 
                int rightFrom = (right[0] == 1)? Math.abs(index - right[1]) -1 :Math.abs(index - right[1]); 
                System.out.println("left: "+left[0]+"/"+left[1] +" right: " +right[0]+"/"+right[1]);
                System.out.println(numbers[i]+":"+leftFrom +"/"+rightFrom);
                if(leftFrom > rightFrom) {
                    answer += "R"; right[0] = 1; right[1] = index;
                }else if(rightFrom > leftFrom) {
                    answer += "L"; left[0] = 1; left[1] = index;
                }else {
                    if(hand.equals("right")){
                        answer += "R"; right[0] = 1; right[1] = index;
                    }else {
                        answer += "L"; left[0] = 1; left[1] = index;
                    }
                }
            }
        }
        return answer;
    }
}
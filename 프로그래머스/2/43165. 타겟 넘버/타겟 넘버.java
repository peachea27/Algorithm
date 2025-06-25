class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
            repeat(numbers, target, 0, 0);
        return answer;
    }
    
    public void repeat(int[] numbers, int target, int index, int sum){
        if(index == numbers.length){
            if(sum == target) answer++;
            return;
        }
        repeat(numbers,target,index+1,sum + numbers[index]);
        repeat(numbers,target,index+1,sum - numbers[index]);
    }
}
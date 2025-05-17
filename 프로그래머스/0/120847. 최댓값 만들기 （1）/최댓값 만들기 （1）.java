import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int last = numbers.length-1;
        Arrays.sort(numbers);
        return numbers[last]*numbers[last-1];
    }
}
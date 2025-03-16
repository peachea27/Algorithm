class Solution {  
    public int solution(int n) {
        int answer = 0;
        int targetBits = countSetBits(n); 
        int next = n + 1;

        while (true) {
            if (countSetBits(next) == targetBits) {
                answer = next;
                break;
            }
            next++;
        }

        return answer;
    }

    private int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1; 
        }
        return count;
    }
}
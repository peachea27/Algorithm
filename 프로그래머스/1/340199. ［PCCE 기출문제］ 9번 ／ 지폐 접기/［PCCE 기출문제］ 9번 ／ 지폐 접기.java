class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int shorterB = Math.min(bill[0], bill[1]);
        int longerB = Math.max(bill[0], bill[1]);
        int shorterW = Math.min(wallet[0], wallet[1]);
        int longerW = Math.max(wallet[0], wallet[1]);
        boolean bool = shorterB > shorterW || longerB > longerW;
        while(bool) {
            longerB = longerB / 2;
            answer++;
            if(shorterB > longerB){
                int tmp = longerB;
                longerB = shorterB;
                shorterB = tmp;
            }
            bool = shorterB > shorterW || longerB > longerW;
        }
        return answer;
    }
}
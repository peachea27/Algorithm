class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        // 맨 앞의 수 : 1, w*2, w*2+1, w*4
        // 맨 뒤의 수 : w, w+1, w*3, w*3+1
        // 1 ~ w / w+1 ~ w*2 / w*2+1 ~ w*3 / w*3+1 ~ w*4
        // 마지막 한칸은 계산하지 말고 따로 +1 해주기
        // 총 22개면 6*3 즉 3개층 + 1개의 보너스 층이 있다고 가정
        // num 8이면 6*2이하, 즉 2층에 속함. 3개층이므로 2층+3층+ (4층?)
        // 홀수층은 왼->오/ 짝수층은 오->왼
        // 8은 2층이므로 12-4(인덱스4)
        // 4번째 층은 24-4 : 20이 22미만이므로 추가해줘야 함
        // 3은 1층이므로 1+2 (인덱스 2) 4번째 층은 24-22 인덱스 2부터 있으므로 4층 추가..
        
        //1.층계산
        int floors = n / w; // 3층
        int place = (int)Math.ceil((double)num/ w); // double타입으로 해줘야 소수점을 올릴 수 있음
        answer = floors - place + 1;
        //4층 계산해서 더하기
        int index = 0;
        if(place % 2 == 0) index = place * w - num;
        else index = num - (place - 1)* w - 1;
        //
        int topIndex = 0;
        if(n > floors * w ){
            if(floors % 2 == 0) {
                topIndex = n - w*floors;
                if(index <= topIndex) answer++;
            }else {
                topIndex = w*(floors+1) - n; 
                if(index>= topIndex) answer++;
            }
        }
        return answer;
    }
}
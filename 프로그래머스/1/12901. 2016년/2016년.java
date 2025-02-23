class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int days = b;
        for ( int i = 1; i < a; i++) {
            if(i == 1 || i == 3|| i == 5 || i ==7 || i == 8 || i == 10) 
                days+= 31;//31일
            else if (i == 2) days+= 29;// 28일 윤년
            else days+= 30;// 30일     
        }
        int cal = days % 7;
        switch(cal){
            case 1: return "FRI";
            case 2: return "SAT";
            case 3: return "SUN";
            case 4: return "MON";
            case 5: return "TUE";
            case 6: return "WED";
            case 0: return "THU";
        }
            
        return answer;
    }
}
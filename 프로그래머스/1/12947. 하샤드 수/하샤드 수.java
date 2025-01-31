class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String xStr =Integer.toString(x);
        for(int i = 0; i <xStr.length(); i++){
          int xNum = Character.getNumericValue(xStr.charAt(i));
          sum += xNum;
        }
        if(x % sum != 0) return false;
        
        return answer;
    }
}
class Solution {
    public int solution(int[][] sizes) {
        //둘 중 더 큰수를 무조건 가로로 계산, 둘 중 더 작은 수를 무조건 세로로 계산.
        //가장 긴 가로와 가장 큰 세로 곱한 값
        int width = 0;
        int height = 0;
        for ( int[] size : sizes){
           int widthTmp = size[0] > size[1] ? size[0] : size[1];
           int heightTmp = (widthTmp == size[0])? size[1] : size[0];
            if(width == 0 || widthTmp > width) width = widthTmp;
            if(height == 0 || heightTmp > height) height = heightTmp;
        }
        int answer = width * height;
        return answer;
    }
}
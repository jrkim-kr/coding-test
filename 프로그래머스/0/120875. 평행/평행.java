class Solution {
    public int solution(int[][] dots) {
        return ((dots[1][1]-dots[0][1])*(dots[3][0]-dots[2][0]) == (dots[3][1]-dots[2][1])*(dots[1][0]-dots[0][0])) ||
               ((dots[2][1]-dots[0][1])*(dots[3][0]-dots[1][0]) == (dots[3][1]-dots[1][1])*(dots[2][0]-dots[0][0])) ||
               ((dots[3][1]-dots[0][1])*(dots[2][0]-dots[1][0]) == (dots[2][1]-dots[1][1])*(dots[3][0]-dots[0][0])) ? 1 : 0;
    }
}
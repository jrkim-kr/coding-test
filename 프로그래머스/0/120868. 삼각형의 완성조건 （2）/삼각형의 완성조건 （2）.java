import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        // 배열에 가장 긴 변이 있는 경우
        for (int i = 1; i <= sides[1]; i++) {
            if (sides[0] + i > sides[1]) {
                answer++;
            }               
        }      
            
        // 배열에 가장 긴 변이 없는 경우
        for (int i = sides[1] + 1; i < sides[0] + sides[1]; i++) {
            answer++;
        }
        
        return answer;
    }
}
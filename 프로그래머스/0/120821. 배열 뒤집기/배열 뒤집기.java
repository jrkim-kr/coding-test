import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
       
        int[] answer = new int[num_list.length];
        for (int n = num_list.length - 1; n >= 0; n--)
            answer[num_list.length - n - 1] = num_list[n];
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(String s) {
        
        Stack<Integer> answer = new Stack();
        String[] tokens = s.split(" ");
        
        for (String token : tokens) {
            if (token.equals("Z")) {
                answer.pop();
            } else {
                answer.push(Integer.parseInt(token));
            }
        }
        return answer.stream().mapToInt(i -> i).sum();
    }
}
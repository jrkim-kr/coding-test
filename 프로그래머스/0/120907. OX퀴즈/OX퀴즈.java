import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] tokens = {};
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < quiz.length; i++) {
            tokens = quiz[i].split(" ");
            int result = Integer.parseInt(tokens[0]);
            
            if ("+".equals(tokens[1])) {
                result += Integer.parseInt(tokens[2]);
            } else {
                result -= Integer.parseInt(tokens[2]);
            }
            
            if (result == Integer.parseInt(tokens[4])) {
                answer.add("O");
            } else {
                answer.add("X");
            }
        }
                
        return answer.toArray(new String[0]);
    }
}
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i ++) {
            if (s.length() - s.replace(String.valueOf(s.charAt(i)), "").length() == 1) {
                answer += s.charAt(i);
            }
        }
        
        return answer.chars()
                    .sorted()
                    .mapToObj(c -> String.valueOf((char) c))
                    .collect(Collectors.joining());
    }
}
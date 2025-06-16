import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList();
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.add(Character.getNumericValue(c));
            }
        }
        
        Collections.sort(answer);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
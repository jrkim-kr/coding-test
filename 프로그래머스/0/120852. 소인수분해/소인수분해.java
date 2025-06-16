import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList();
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
                while (n % i == 0) {
                    n = n / i;
                }
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
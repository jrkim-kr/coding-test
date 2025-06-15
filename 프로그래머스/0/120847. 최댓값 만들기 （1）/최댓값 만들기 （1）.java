import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        int[] sorted = Arrays.stream(numbers)
                            .boxed()
                            .sorted(Collections.reverseOrder())
                            .mapToInt(i -> i)
                            .toArray();
        
        return sorted[0] * sorted[1];
    }
}
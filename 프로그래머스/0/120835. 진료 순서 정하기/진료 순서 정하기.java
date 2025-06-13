import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> sorted = Arrays.stream(emergency) // int[] → IntStream
                                    .boxed() // IntStream -> Stream<Integer>
                                    .sorted(Collections.reverseOrder()) 
                                    .collect(Collectors.toList()); // Stream<Integer> -> List<Integer>
            
        
        return Arrays.stream(emergency)
                    .map(e -> sorted.indexOf(e) + 1) // int -> Stream<Integer>
                    .toArray(); // Stream<Integer> -> int[]
    }
}
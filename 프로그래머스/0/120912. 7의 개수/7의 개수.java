import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        
        return (int) Arrays.stream(array)
                           .mapToObj(String::valueOf)
                           .collect(Collectors.joining())
                           .chars()
                           .filter(c -> c == '7')
                           .count();
    }
}
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array) {
        int maxIndex = IntStream.range(0, array.length)
                                .reduce((i,j) -> array[i] > array[j] ? i : j)
                                .getAsInt();
        
        return new int[] {array[maxIndex], maxIndex};
    }
}
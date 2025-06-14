public class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (direction.equals("right")) {
            // 1. 마지막 원소를 맨 앞에 배치
            answer[0] = numbers[numbers.length - 1];
            
            // 2. 나머지 원소들을 한 번에 복사 (0번째부터 length-1개를 1번째 위치부터 복사)
            System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);
            
        } else {
            // 1. 두 번째 원소부터 마지막까지를 앞쪽으로 복사 (1번째부터 length-1개를 0번째 위치부터 복사)
            System.arraycopy(numbers, 1, answer, 0, numbers.length - 1);
            
            // 2. 첫 번째 원소를 맨 뒤에 배치
            answer[numbers.length - 1] = numbers[0];
        }
        
        return answer;
    }
}

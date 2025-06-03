class Solution {
    public int[] solution(int[] numbers) {
        int[] answers = new int[numbers.length];
        for (int n = 0; n < numbers.length; n++) {
            answers[n] = numbers[n] * 2;
        }
        return answers;
    }
}
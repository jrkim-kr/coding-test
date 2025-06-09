class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for (int n = 0; n < num_list.length; n ++) {
            if (num_list[n] % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            int rank = 1;
            double theAvg = (score[i][0] + score[i][1]) / 2.0;
            
            for (int j = 0; j < score.length; j++) {
                double otherAvg = (score[j][0] + score[j][1]) / 2.0;
                if (otherAvg > theAvg) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}
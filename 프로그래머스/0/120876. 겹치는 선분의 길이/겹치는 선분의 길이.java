class Solution {
    public int solution(int[][] lines) {
        // 모든 선분의 시작점과 끝점 중 최소값과 최대값을 찾습니다
        int minStart = Integer.MAX_VALUE;
        int maxEnd = Integer.MIN_VALUE;
        
        for (int[] line : lines) {
            minStart = Math.min(minStart, line[0]);
            maxEnd = Math.max(maxEnd, line[1]);
        }
        
        int answer = 0;
        
        // 각 구간을 1씩 증가시키면서 겹치는 선분의 개수를 확인
        for (int i = minStart; i < maxEnd; i++) {
            int count = 0;
            
            // 현재 구간 [i, i+1]이 각 선분에 포함되는지 확인
            for (int[] line : lines) {
                // 선분 [start, end]에서 구간 [i, i+1]이 완전히 포함되는지 확인
                if (line[0] <= i && i + 1 <= line[1]) {
                    count++;
                }
            }
            
            // 2개 이상의 선분이 겹치면 길이 추가
            if (count >= 2) {
                answer++;
            }
        }
        
        return answer;
    }
}
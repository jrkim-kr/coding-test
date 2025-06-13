class Solution {
    public int solution(int balls, int share) {
        
        // nCr = n × (n-1) × ... × (n-r+1) / (1 × 2 × ... × r)
        long answer = 1;
        
        // share번 반복하면서 위쪽은 곱하고 아래쪽은 나누기
        for (int i = 0; i < share; i++) {
            answer = answer * (balls - i) / (i + 1);
        }
        
        return (int) answer;

    }
}
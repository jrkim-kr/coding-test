class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupons = chicken;
        
        while (coupons >= 10) {
            answer += coupons / 10;
            coupons = coupons % 10 + coupons / 10;
        }
        return answer;
    }
}
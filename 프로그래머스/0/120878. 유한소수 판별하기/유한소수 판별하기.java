class Solution {
    public int solution(int a, int b) {
        // 1. 최대공약수를 구해서 기약분수로 만들기
        int denominator = b / gcd(a, b);
        
        // 2. 분모에서 2와 5를 모두 제거
        while (denominator % 2 == 0) {
            denominator /= 2;
        }
        while (denominator % 5 == 0) {
            denominator /= 5;
        }
        
        // 3. 남은 분모가 1이면 유한소수, 아니면 무한소수
        return denominator == 1 ? 1 : 2;
    }
    
    // 유클리드 호제법으로 최대공약수 구하기
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        int a = numer, b = denom;
        while (b != 0) {
            int temp = b;            
            b = a % b;
            a = temp;
        }
        
        int[] answer = {numer/a, denom/a};
        return answer;
    }
}
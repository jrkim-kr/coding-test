class Solution {
    public int solution(int slice, int n) {
        int pizza = 1;
        
        while ((pizza * slice) / n == 0) {
            pizza++;
        }
        
        return pizza;
    }
}
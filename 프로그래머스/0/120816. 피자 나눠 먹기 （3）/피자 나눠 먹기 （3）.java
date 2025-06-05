class Solution {
    public int solution(int slice, int n) {
        int pizza = 1;
        
        // 현재 피자로 모든 사람이 먹을 수 있을 때까지 반복
        while (pizza * slice < n) {
            pizza++;
        }
        
        return pizza;
    }
}
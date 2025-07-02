class Solution {
    public int solution(int num, int k) {

        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        
        return numStr.indexOf(kStr) == -1 ? -1 : numStr.indexOf(kStr) + 1;
        
    }
}
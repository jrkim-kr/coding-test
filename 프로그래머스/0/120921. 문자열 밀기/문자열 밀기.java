class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }
        
        String currStr = A;
        for (int i = 1; i < A.length(); i++) {
            currStr = currStr.charAt(A.length() - 1) + currStr.substring(0, A.length() - 1);
            
            if (currStr.equals(B)) {
                return i;
            }
        }
        return -1;
    }
}
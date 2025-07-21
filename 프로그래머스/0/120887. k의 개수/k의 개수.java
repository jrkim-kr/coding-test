class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int n = i; n <= j; n++) {
            if (String.valueOf(n).contains(String.valueOf(k))) {
                answer += String.valueOf(n).length() - String.valueOf(n).replace(String.valueOf(k), "").length();
            }
        }
        return answer;
    }
}
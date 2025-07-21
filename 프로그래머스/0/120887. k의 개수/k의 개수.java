class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int n = i; n <= j; n++) {
            if (Integer.toString(n).contains(Integer.toString(k))) {
                answer += Integer.toString(n).length() - Integer.toString(n).replace(Integer.toString(k), "").length();
            }
        }
        return answer;
    }
}
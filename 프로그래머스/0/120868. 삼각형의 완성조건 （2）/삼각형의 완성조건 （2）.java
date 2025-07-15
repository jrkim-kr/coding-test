class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        // 경우 1: 주어진 두 변 중 하나가 가장 긴 변
        // max - min < x < max + min
        // x <= max (max가 가장 긴 변이므로)
        // 즉, max - min < x <= max
        int case1 = max - (max - min);  // = min

        // 경우 2: 세 번째 변이 가장 긴 변
        // max < x < max + min
        int case2 = (max + min - 1) - max;  // = min - 1

        return case1 + case2;
    }
}
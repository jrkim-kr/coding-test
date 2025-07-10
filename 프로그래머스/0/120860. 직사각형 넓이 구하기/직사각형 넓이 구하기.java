class Solution {
    public int solution(int[][] dots) {
        int minX = dots[0][0];
        int minY = dots[0][1];
        int maxX = dots[0][0];;
        int maxY = dots[0][1];    
        
        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxX = Math.max(maxX, dot[0]);
            maxY = Math.max(maxY, dot[1]);
        }
        
        return (maxX - minX) * (maxY - minY);
    }
}
class Solution {
    public int solution(int M, int N) {
        // M x N 크기의 종이를 1x1로 자르려면
        // 총 M*N개의 조각이 필요하고
        // 처음 1개에서 시작해서 가위질 한 번당 조각이 하나씩 증가하므로
        // M*N - 1번의 가위질이 필요
        return M * N - 1;
    }
}
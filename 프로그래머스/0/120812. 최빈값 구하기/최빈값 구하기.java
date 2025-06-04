import java.util.*;

class Solution {
    public int solution(int[] array) {
        // 1. 각 원소 등장 갯수 계산
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // 2. 최대 등장 횟수 계산
        int countMax = 0;
        for (int count : countMap.values()){
            countMax = Math.max(countMax, count);
        }
        
        // 3. 최빈값 찾기
        int answer = -1;
        int modeCount = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            if (entry.getValue() == countMax) {
                modeCount++;
                if (modeCount == 1) {
                    answer = entry.getKey();
                } 
                else {
                    answer = -1;   
                } 
            }
        }
        
       return answer; 
    }
}
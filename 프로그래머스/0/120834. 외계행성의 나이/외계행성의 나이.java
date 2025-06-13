class Solution {
    public String solution(int age) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String answer = "";
        for (char c : String.valueOf(age).toCharArray()) {
            answer += alphabet[c - '0'];
        }   
        
        return answer;
    }
}
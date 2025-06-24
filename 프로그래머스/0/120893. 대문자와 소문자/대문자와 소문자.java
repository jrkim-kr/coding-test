class Solution {
    public String solution(String my_string) {
        
        StringBuilder answer = new StringBuilder();
        
        for (char s : my_string.toCharArray()) {
            if (Character.isUpperCase(s)) {
                answer.append(Character.toLowerCase(s));
            } else {
                answer.append(Character.toUpperCase(s));
            }
        }
        return answer.toString();
    }
}
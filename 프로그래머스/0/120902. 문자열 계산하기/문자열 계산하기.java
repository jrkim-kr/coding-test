class Solution {
    public int solution(String my_string) {
        String[] tokens = my_string.split(" ");
        int answer = Integer.parseInt(tokens[0]);
        
        for (int i = 1; i < tokens.length; i += 2) {
            if ("+".equals(tokens[i])) {
                answer += Integer.parseInt(tokens[i+1]);
            } else {
                answer -= Integer.parseInt(tokens[i+1]);
            }
        }
                
        return answer;
    }
}
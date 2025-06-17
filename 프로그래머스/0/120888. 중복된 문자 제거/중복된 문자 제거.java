class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(my_string.charAt(0)));
        
        for (int i = 1; i < my_string.length(); i++) {
            if (!sb.toString().contains(String.valueOf(my_string.charAt(i)))) {
                sb.append(String.valueOf(my_string.charAt(i)));
            }
        }
       
        return sb.toString();
    }
}
import java.util.*;
class Solution {
    public String solution(String rsp) {
        HashMap<String, String> win = new HashMap<>();
        
        win.put("2", "0");
        win.put("0", "5");
        win.put("5", "2");
        
        StringBuilder answer = new StringBuilder();
        for (int n = 0; n < rsp.length(); n++) {
            answer.append(win.get(String.valueOf(rsp.charAt(n))));
        }
        return answer.toString();
    }
}
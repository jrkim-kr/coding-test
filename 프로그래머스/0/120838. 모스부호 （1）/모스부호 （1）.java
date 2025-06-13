import java.util.*;
class Solution {
    public String solution(String letter) {
        // 문제에서 제공된 모스부호 배열 (a~z 순서)
        String[] morseArray = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", 
            "--.", "....", "..", ".---", "-.-", ".-..", 
            "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", 
            "-.--", "--.."
        };
        
        // HashMap에 모스부호와 알파벳 매핑
        HashMap<String, Character> morse = new HashMap<>();
        for (int i = 0; i < morseArray.length; i++) {
            morse.put(morseArray[i], (char)('a' + i));
        }
        
        // 입력 문자열 분할 및 변환
        StringBuilder answer = new StringBuilder();
        String[] inputArray = letter.split(" ");
        
        for (String morseCode : inputArray) {
            answer.append(morse.get(morseCode));
        }
        
        return answer.toString();
    }
}



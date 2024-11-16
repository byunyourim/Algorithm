import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
    int len = number.length();
    int keep = len - k; 
    
    Deque<Character> stack = new LinkedList<>();
    
    for (int i = 0; i < len; i++) {
        char digit = number.charAt(i);
        
        while (!stack.isEmpty() && stack.peek() < digit && k > 0) {
            stack.pop();
            k--;
        }
        stack.push(digit);
    }
    
    for (int i = 0; i < keep; i++) {
            answer.append(stack.get(i));
        }

        return answer.toString();
    }
}

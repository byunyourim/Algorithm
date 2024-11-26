import java.util.*;
class Solution {
    String[][] priority = {{"*", "+", "-"}, {"*", "-", "+"}, 
                           {"+", "*", "-"}, {"+", "-", "*"}, 
                           {"-", "*", "+"}, {"-", "+", "*"}};
    public long solution(String expression) {
        long max = 0;
        List<String> operators = new ArrayList<>();
        List<Long> numbers = new ArrayList<>();
        
        splitExpression(expression, numbers, operators);

        for (String[] p : priority) {
            max = Math.max(max, Math.abs(evaluate(numbers, operators, p)));
        }
        
        return max;
    }
    
    private void splitExpression (String expressions, List<Long> numbers, List<String> operators) {
        StringBuilder sb = new StringBuilder();
        for (char c : expressions.toCharArray()) {
            if (c == '+' || c == '*' || c == '-') {
                numbers.add(Long.parseLong(sb.toString()));
                operators.add(String.valueOf(c));
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        
        numbers.add(Long.parseLong(sb.toString()));
    }
    
    private long evaluate(List<Long> numbers, List<String> operators, String[] priority) {
        
        List<Long> nums = new ArrayList<>(numbers);
        List<String> ops = new ArrayList<>(operators);
        
        for (String p : priority) {
            int i = 0;
            while (i < ops.size()) {
                if (ops.get(i).equals(p)) {  
                    long result = calc(ops.get(i), nums.get(i), nums.get(i + 1));
                    nums.set(i, result);
                    nums.remove(i + 1);
                    ops.remove(i);
                } else i++;
            }
        }
        return nums.get(0);
    }
    
    private long calc(String exp, Long num1, Long num2) {
        long res;
        if (exp.equals("*")) {
            res = num1 * num2;
        } else if (exp.equals("+")) {
            res = num1 + num2;
        } else {
            res = num1 - num2;
        }
        return res;
    }
}

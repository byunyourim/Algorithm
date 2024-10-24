// https://school.programmers.co.kr/learn/courses/30/lessons/76502

/**
 * 0. s 배열로 변환
 * 1. s를 왼쪽으로 하나씩 이동
 * 2. 괄호가 올바른지 확인 -> 올바른 경우 cnt + 1
 * 3. 처음과 같으면 cnt 반환
 */
class Solution_괄호회전하기 {
    public int solution(String s) {
        /**
         * 0. s 배열로 변환
         * 1. s를 왼쪽으로 하나씩 이동
         * 2. 괄호가 올바른지 확인 -> 올바른 경우 cnt + 1
         * 3. 처음과 같으면 cnt 반환
         */
        // 0. 배열로 변환
        int cnt = 0;
        String[] arr = s.split("");
        Queue<String> queue = new LinkedList<>();

        for (String value : arr) {
            queue.add(value);
        }

        for (int i=0; i<arr.length; i++) {
            String pollEl = queue.poll();
            queue.add(pollEl);

            if (isValid(queue)) {
                cnt++;
            }
        }
        return cnt;
    }

    private boolean isValid(Queue<String> queue) {
        Stack<String> stack = new Stack<>();

        for (String el : queue) {
            if (el.equals("(") || el.equals("{") || el.equals("[")) {
                stack.push(el);
            } else {
                if (stack.isEmpty()) return false;

                String top = stack.pop();
                if (!isMatchingPair(top, el)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatchingPair(String open, String close) {
        return (open.equals("(") && close.equals(")"))
                || (open.equals("{") && close.equals("}"))
                || (open.equals("[") && close.equals("]"));
    }
}

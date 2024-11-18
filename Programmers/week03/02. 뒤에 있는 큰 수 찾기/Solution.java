class Solution_뒤에있는큰수찾기 {
    public int[] solution1(int[] numbers) {

        int[] res = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int max = -1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    max = numbers[j];
                    break;
                } else {
                    continue;
                }
            }
            res[i] = max;
        }
        return res;
    }

    public int[] solution2(int[] numbers) {
        int[] res = new int[numbers.length];
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            stack.push(numbers[i]);
        }

        return res;
    }
}

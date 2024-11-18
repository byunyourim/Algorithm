import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> tempBox = new Stack<>();
        int cnt = 0;
        int boxNumber = 1;

        for (int target : order) {
            while (boxNumber <= target) {
                tempBox.push(boxNumber);
                boxNumber++;
            }

            if (!tempBox.isEmpty() && tempBox.peek() == target) {
                tempBox.pop();
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }
}

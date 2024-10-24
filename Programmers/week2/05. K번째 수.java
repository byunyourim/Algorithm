// https://school.programmers.co.kr/learn/courses/30/lessons/42748
import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Solution_K번째수 solution = new Solution_K번째수();
        int[] res = solution.solution(array, commands);
    }
}

class Solution_K번째수 {
    public int[] solution(int[] array, int[][] commands) {

        int len = commands.length;
        int[] result = new int[len];

        for (int i=0; i<len; i++) {
            int[] arr = commands[i];
            int[] temp = Arrays.copyOfRange(array, arr[0]-1, arr[1]);

            Arrays.sort(temp);

            int n = arr[2]-1;
            result[i] = temp[n];

        }
        return result;
    }

    public int[] solution2(int[] array, int[][] commands) {
        return Arrays.stream(commands)
                .mapToInt( command -> {
                    int[] temp = Arrays.copyOfRange(array, command[0]-1, command[1]);
                    Arrays.sort(temp);
                    return temp[command[2]-1];
                }).toArray();
    }
}


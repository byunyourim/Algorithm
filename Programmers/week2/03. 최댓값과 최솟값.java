// https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMin {
    public static void main(String[] args) {

        String s = "-1 -2 -3 -4";
        Solution_MaxAndMin  solution = new Solution_MaxAndMin();
        String res = solution.solution(s);

        System.out.println(res);

    }
}

class Solution_MaxAndMin {
    public String solution(String s) {
        List<Integer> list = Arrays.stream(s.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return Collections.min(list) + " " + Collections.max(list);
    }
}

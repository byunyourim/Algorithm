import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int cnt = 0;
        Arrays.sort(people);

        int min = 0;
        for (int max = people.length - 1; max >= min; max--) {
            if (people[min] + people[max] <= limit) min++;
            
            cnt++;
        }
            
        return cnt;
    }
}

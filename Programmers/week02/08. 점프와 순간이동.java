// https://school.programmers.co.kr/learn/courses/30/lessons/12980
class Solution_점프와순간이동 {
    public int solution(int n) {
        int k = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                k++;
                n--;
            }
            n /= 2;
        }
        return k;
    }
}

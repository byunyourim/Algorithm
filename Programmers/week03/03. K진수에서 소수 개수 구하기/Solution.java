import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int n, int k) {
        String value = Integer.toString(n, k);

        String[] numbers = value.split("0");

        int primeCount = 0;

        for (String numberStr : numbers) {
            if (numberStr.isEmpty()) continue;

            long num = Long.parseLong(numberStr);

            if (num < 2) {
                continue;
            }

            if (isPrime(num)) {
                primeCount++;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    break;
                }

            }
        }
        return primeCount;
    }
    
    private boolean isPrime(long num) {
        if (num < 2) return false;

        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

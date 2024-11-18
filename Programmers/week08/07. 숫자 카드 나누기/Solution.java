class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        
        for (int i = 1; i < arrayA.length; i++) {
            gcdA = gcd(gcdA, arrayA[i]);
            gcdB = gcd(gcdB, arrayB[i]);
        }
        
        if (isDivisibleByGcd(arrayB, gcdA)) {
            gcdA = 0;;
        }
        
        
        if (isDivisibleByGcd(arrayA, gcdB)) {
            gcdB = 0;;
        }

        return Math.max(gcdA, gcdB);
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    private boolean isDivisibleByGcd(int[] arr, int gcd) {
        if (gcd == 0) return false;
        for (int num : arr) {
            if (num % gcd == 0) {
                return true;
            }
        }
        return false;
    }
}

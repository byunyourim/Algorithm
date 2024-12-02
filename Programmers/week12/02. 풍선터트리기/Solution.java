import java.util.*;
class Solution {
    public int solution(int[] a) {
        int n = a.length;
        
        int[] lmin = new int[n];
        lmin[0] = a[0];
        for (int i = 1; i < n; i++) {
            lmin[i] = Math.min(lmin[i - 1], a[i]);
        }
        
        int[] rmin = new int[n];
        rmin[n - 1] = a[n - 1];
        for (int i = n-2; i >= 0; i--) {
            rmin[i] = Math.min(rmin[i + 1], a[i]);
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <= lmin[i] || a[i] <=rmin[i]) {
                count++;
            }
        }
        
        return count;
    }
}

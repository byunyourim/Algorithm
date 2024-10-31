import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] newArr1 = new String[n];
        String[] newArr2 = new String[n];
        for (int i = 0; i < n; i++) {
            int val1 = arr1[i];
            int val2 = arr2[i];
            
            String binary1 = String.format("%" + n + "s", Integer.toBinaryString(val1)).replace(' ', '0');
            String binary2 = String.format("%" + n + "s", Integer.toBinaryString(val2)).replace(' ', '0');
            
            newArr1[i] = binary1;
            newArr2[i] = binary2;
        }
        
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            
            for (int j = 0; j < n; j++) {
                
                char a1 = newArr1[i].charAt(j);
                char a2 = newArr2[i].charAt(j);
                
                if (a1 == '1' || a2 == '1') {
                    builder.append("#");
                }
                if (a1 == '0' && a2 == '0') {
                    builder.append(" ");
                }
            }
            result[i] = builder.toString();
        }
        
        return result;
    }
}

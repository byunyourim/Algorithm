public class Solution {
    public static int solution(String s) {
        int minLength = s.length(); 

        for (int unit = 1; unit <= s.length() / 2; unit++) {
            StringBuilder compressed = new StringBuilder();
            String prev = s.substring(0, unit); 
            int count = 1; 

            for (int i = unit; i < s.length(); i += unit) {
                String current = (i + unit > s.length()) ? s.substring(i) : s.substring(i, i + unit);

                if (prev.equals(current)) {
                    count++;
                } else { 
                    if (count > 1) {
                        compressed.append(count);
                    }
                    compressed.append(prev);
                    prev = current;
                    count = 1;
                }
            }

            if (count > 1) {
                compressed.append(count);
            }
            compressed.append(prev);

            minLength = Math.min(minLength, compressed.length());
        }

        return minLength;
    }

}

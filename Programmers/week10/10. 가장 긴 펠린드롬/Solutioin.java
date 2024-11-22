class Solution{
  
    public int solution(String s)
    {
        int answer = 0;
        
        int n = s.length();
        int maxLen = 1;
        
        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, expandAroundCenter(s, i, i));
            maxLen = Math.max(maxLen, expandAroundCenter(s, i, i + 1));
        }

        return maxLen;
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

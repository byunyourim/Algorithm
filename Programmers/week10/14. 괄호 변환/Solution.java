class Solution {
    public String solution(String p) {
        if (p.isEmpty()) return "";

        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();
        int balance = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') balance++;
            else balance--;

            u.append(p.charAt(i));
            if (balance == 0) {
                v.append(p.substring(i + 1));
                break;
            }
        }

        if (isCorrect(u.toString())) {
            return u + solution(v.toString());
        }

        StringBuilder result = new StringBuilder();
        result.append("("); 
        result.append(solution(v.toString())); 
        result.append(")"); 

        u.deleteCharAt(0);
        u.deleteCharAt(u.length() - 1);
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') result.append(')');
            else result.append('(');
        }

        return result.toString(); 
    }

    private boolean isCorrect(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') count++;
            else count--;

            if (count < 0) return false; 
        }
        return count == 0;
    }
}

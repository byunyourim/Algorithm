import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        multipleSets(list1, str1); // str1의 다중집합 생성
        multipleSets(list2, str2); // str2의 다중집합 생성
        
        double union = 0.0;
        double intersection = 0.0;
        
        if (list1.size() == 0 && list2.size() == 0) {
            return 65536;
        }
        
        for (int i = 0; i < list1.size(); i++) {
            String str = list1.get(i);
            
            if (list2.contains(str)) {
                intersection++;
                list2.remove(str); 
            }
            union++; 
        }
        
        return (int) (intersection / (union + list2.size()) * 65536);
    }
    
    static void multipleSets(List<String> list, String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            String s = str.substring(i, i + 2).replaceAll("[^a-zA-Z]", "");
            if (s.length() == 2)
                list.add(s);
        }
    }
}

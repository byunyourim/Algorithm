import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        List<Map<String, Integer>> dataList = new ArrayList<>();
        for (String file : files) {
            String numStr = extractLeadingNumber(file);
            dataList.add(Map.of(file, Integer.parseInt(numStr)));
        }
        
        dataList.sort(Comparator.comparing((Map<String, Integer> map) -> {
                    String key = map.keySet().iterator().next();
                    String head = key.replaceAll("[0-9].*", "");
                    return head.toLowerCase(); 
                })
                .thenComparing(map -> map.values().iterator().next())); 

        String[] result = new String[files.length];
        int idx = 0;
        for (Map<String, Integer> data : dataList) {
            result[idx] = data.keySet().iterator().next(); // 원래 파일 이름 반환
            idx++;
        }
        
        return result;
    }
    
    public static String extractLeadingNumber(String text) {
        String result = text.replaceAll("^[^0-9]*", ""); // 숫자 앞의 문자 제거
        result = result.replaceAll("([0-9]+).*", "$1"); // 첫 번째 숫자 부분만 추출
        return result;
    }
}

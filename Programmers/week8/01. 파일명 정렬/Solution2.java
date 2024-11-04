import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        List<Map<String, Integer>> dataList = new ArrayList<>();
        for (String file : files) {
            String numStr = extractLeadingNumber(file);
            dataList.add(Map.of(file, Integer.parseInt(numStr)));
        }
        
        // HEAD와 NUMBER로 정렬
        dataList.sort(Comparator.comparing((Map<String, Integer> map) -> {
                    String key = map.keySet().iterator().next();
                    String head = key.replaceAll("[0-9].*", ""); // 숫자 이후의 모든 부분을 제거
                    return head.toLowerCase(); // 대소문자 구분 없이 정렬
                })
                .thenComparing(map -> map.values().iterator().next())); // NUMBER로 정렬

        String[] result = new String[files.length];
        int idx = 0;
        for (Map<String, Integer> data : dataList) {
            result[idx] = data.keySet().iterator().next(); // 원래 파일 이름 반환
            idx++;
        }
        
        return result;
    }
    
    public static String extractLeadingNumber(String text) {
        // 숫자를 추출하는 메서드
        String result = text.replaceAll("^[^0-9]*", ""); // 숫자 앞의 문자 제거
        result = result.replaceAll("([0-9]+).*", "$1"); // 첫 번째 숫자 부분만 추출
        return result;
    }
}

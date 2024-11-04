import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        List<FileInfo> fileList = new ArrayList<>();
        
        for (String file : files) {
            FileInfo fileInfo = parseFile(file);
            fileList.add(fileInfo);
        }
        
        // 정렬
        Collections.sort(fileList);
        
        // 정렬된 결과를 배열로 변환
        String[] result = new String[files.length];
        for (int i = 0; i < fileList.size(); i++) {
            result[i] = fileList.get(i).originalName;
        }
        
        return result;
    }
    
    // 파일 정보를 담는 내부 클래스
    private static class FileInfo implements Comparable<FileInfo> {
        String originalName;
        String head;
        int number;
        String tail;
        
        FileInfo(String originalName, String head, int number, String tail) {
            this.originalName = originalName;
            this.head = head.toLowerCase(); // 대소문자 구분 없이 처리
            this.number = number;
            this.tail = tail;
        }
        
        @Override
        public int compareTo(FileInfo other) {
            // HEAD 비교
            int headComparison = this.head.compareTo(other.head);
            if (headComparison != 0) {
                return headComparison; // HEAD가 다르면 그 결과 반환
            }
            // NUMBER 비교
            return Integer.compare(this.number, other.number); // NUMBER는 정수로 비교
        }
    }
    
    // 파일명을 파싱하여 FileInfo 객체 생성
    private FileInfo parseFile(String file) {
        String head = "";
        String numberStr = "";
        String tail = "";

        // HEAD 찾기
        int i = 0;
        while (i < file.length() && !Character.isDigit(file.charAt(i))) {
            head += file.charAt(i);
            i++;
        }
        
        // NUMBER 찾기
        while (i < file.length() && Character.isDigit(file.charAt(i))) {
            numberStr += file.charAt(i);
            i++;
        }
        
        // TAIL 찾기
        while (i < file.length()) {
            tail += file.charAt(i);
            i++;
        }

        // NUMBER를 정수로 변환
        int number = Integer.parseInt(numberStr);
        
        return new FileInfo(file, head, number, tail);
    }
}

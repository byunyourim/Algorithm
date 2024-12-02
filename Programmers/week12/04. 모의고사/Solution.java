// https://school.programmers.co.kr/learn/courses/30/lessons/42840
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
   
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] arr= new int[3];
        
        for (int i=0;i<answers.length;i++) {
            // 일치여부 비교 
            if(person1[i%person1.length] == answers[i]) arr[0]++;
            if(person2[i%person2.length] == answers[i]) arr[1]++;
            if(person3[i%person3.length] == answers[i]) arr[2]++;
        }
        
        // 최대값 찾기
        int max = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        // 동일한 사람이 있나
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == max) {
                tmp.add(i+1);
            }
        }
        int[] answer = new int[tmp.size()];
        for(int i=0;i< tmp.size();i++) {
            answer[i] = tmp.get(i);
        }
        
        return answer;
    }
}

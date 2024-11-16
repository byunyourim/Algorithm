https://school.programmers.co.kr/learn/courses/30/lessons/42862

 
 
## 재정의
- 체육 수업을 들을 수 있는 학생의 최대값
- 자신의 앞, 뒤로만 체육복을 빌려줄 수 있다.

## 알고리즘
- lost, reserved에 중복으로 있는 학생의 경우 제거
- lost학생의 앞이나 뒤에 여벌이 있는 학생이 있는지 확인 후 빌릴 수 있으면 빌린다.




## 의사코드

## 구현
```
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        // 여분의 체육복이 있지만 도난당한 학생은 빌려줄 수 없음
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]==reserve[j]){
                    answer ++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 옷을빌려주고 -1로 만듬
        for(int i = 0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]==reserve[j]-1||lost[i]==reserve[j]+1) {
                    answer ++;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        

        return answer;
    }
}
```

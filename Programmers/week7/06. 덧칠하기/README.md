## 덧칠하기
https://school.programmers.co.kr/learn/courses/30/lessons/161989
- 소요시간 : 50


## 재정의
- n : 벽의 길이
- m : 롤러의 길이 
- section : 다시 페인트를 칠할 구역 (배열) 1 <= section <= n

- section은 정렬되어 있다.
- 다시 칠하기로 한 구역은 적어도 반드시 한 번은 페인트를 칠해야 한다.  
- 페인트칠을 하는 횟수를 최소화해야 한다.

  
## 알고리즘
1. n 만큼 반복문을 순회한다.
2. 다시 칠해야 하는 구역인 경우 칠한다.
3. 칠한 횟수를 증가시킨다.
4. 그리고 그 구역만큼 더해서 이동한다.
5. 그 공간이 section안에 속해 있는 경우 지운다.
6. 위 과정을 반복한다.
7. 남은 section이 없는 경우 종료한다.



## 의사코드
```
int cnt;
int idx;
while (sections) {
    cnt++;
    range : 범위/ 현재 + m
    while( 페인트 범위 안에 포함되는 구간모두 건너 뜀) {
        i++;
    }
} 

return cnt;
```


## 구현

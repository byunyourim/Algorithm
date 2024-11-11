https://school.programmers.co.kr/learn/courses/30/lessons/68645

## 재정의
- 반시계 방향으로 달팽이 채우기를 진행한다.
- 첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 리턴 하자.


## 알고리즘
규칙을 찾아보면....

- 아래, 우측, 좌측 대각선 방향으로 움직인다.

<img width="289" alt="image" src="https://github.com/user-attachments/assets/b105db7e-4a0a-4700-afd5-6fd2edc9e3ce">
- 아래쪽으로 n 만큼 -> 우측으로 n-1만큼 -> 대각선 방향으로 n-2만큼 
- 위의 사이클이 반복된다.
- (0, 0), (1, 0), (2, 0), (3, 0)  (행이 1만큼 증가한다.)
- (3, 1), (3, 2), (3, 3)  (열이 1만큼 증가한다.)
- (2, 2), (1, 1) (행과, 열이 각각 1만큼 감소한다.)


- 1단계 : n 만큼 아래로 이동 (x++)
- 2단계 : n-1 만큼 우측으로 이동 (y++)
- 3단계 : n-2 만큼 대각선으로 이동 (x--, y--)
- 위의 3단계 반복



## 의사코드
```
x = 1, y = 0
dalpange = new int[][]
answer = new int[]
int num = 1;

for ( 단계 : 어느 방향 ) {
   for (열의 수 : 몇 개 갈건지 : 전 단계보다 하나씩 줄어야 함 -> n-i) {
      if (i % 3 == 0 ) x 증가 : 아래로   .. 1 단계, 4단계 ~~~ 
      if (i % 3 == 1 ) y 증가 : 우측으로
      if (i % 3 == 2 ) x, y 감소 : 대각선

      dalpaeng[x][y] = num;
      num++;
   }
}

k = 0
for (i) {
   for (j) {
      if (dalpaeng[i][j] 0이면 )넘어가기
      answer[k++] = dalpaeng[i][j];
   }

}
```



## 구현

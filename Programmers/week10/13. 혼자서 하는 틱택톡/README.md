https://school.programmers.co.kr/learn/courses/30/lessons/160585

<br><br>

## 재정의
- 게임판이 규칙을 지켜서 틱택토를 진행했을 때 나올 수 있는 게임 상황이면 1을 아니면 0을 return
- **'실수를 했을 가능성이 있는가'를 찾는 것이 아님!!!!**
- 이 게임판이 규칙을 지켜서 진행한 틱택토에서 나올 수 있는 상황인가

  
<img width="607" alt="스크린샷 2024-11-24 오전 10 46 59 1" src="https://github.com/user-attachments/assets/89d7e91b-bcfa-4cfe-b25b-c5ee530e29fc">







<br><br>

## 알고리즘
- 순서는 O 다음 X가 나온다. (X가 먼저 나ㅏ오면 안돼, 아무것ㄷ 없어도 안돼)
- 따라서 항상 O >= X 이다.
- 어느 하나라도 가로, 세로, 대각선 방향으로 2개가 같은 표기가되면 바로 게임이 끝나야 한다.

1. 말이 하나도 없는 경우
  - return 1;
2. O, X의 크기를 비교한다.
  - O < X 의 갯수보다 작은 경우 return 0
3. 대각선인 경우 게임이 끝나야
  - O가 빙고인 경우 : O > X
  - X가 빙고인 경우 : O == X
  - 가로 빙고 : 같은 행 [i][0], [i][1], [i][2], 
  - 세로 빙고 : 같은 열 [0][j], [1][j], [2][j], 
  - 대각선 빙고 : 골고루 [0][0], [1][1], [2][2] / [0][2], [1][1], [2][0]

<br>

#### 시간 복잡도
- 3x3 크기의 보드를 순회하며 O와 X의 개수를 계산, 고정된 3x3 배열이므로 상수 시간
- O(1)
#### 공간 복잡도
- String[] board 항상 3x3로 고정되어 있음
- 2차원 배열 arr는 (3x3)로 생성
  oCount, xCount는 정수형 변수로 고정된 크기만 사용.
- O(1)


<br><br>

## 의사코드
```
arr = new String[3][3];
int oCnt = 0;
int xCnt = 0;
for (board) {
  보드판 세팅
  각 개수 확인
}

if (O, X가 아예 없으면) return 0;
if (oCnt < xCnt)  return 0;
if (oCnt > xCnt + 1) return 0;

int oWin = 0;
int xWin = 0;
for (1~3) {
  if (대각선이 존재하는지 ) :
     oWin++, xCnt++;
}

if (둘다 대각선이 있는 경우) return 0;
if (O 대각선이 존재하고, 차이가 1개가 아닌 경우) return 0
if (x 대각선이 존재하고 , 둘의 개수가 갖지 않을 때) return 0;
 
return 1;
 
```



<br><br>

## 구현

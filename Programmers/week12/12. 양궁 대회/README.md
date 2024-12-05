https://school.programmers.co.kr/learn/courses/30/lessons/92342

## 재정의
라이언이 가장 큰 점수차로 이길 수 있도록 만들기..

<img width="748" alt="image" src="https://github.com/user-attachments/assets/0b147448-9fd6-4712-89d7-98f5ef634299">

<br>

## 알고리즘
최대한 많은 게임을 이겨야 한다.
1. dfs 탐색, 라이언이 쓸 수 있는 화살, 현재 점수
   1. 점수를 얻거나
   2. 점수를 포기하고 다음 단계로 가거나
2. 최종 점수 비교
3. 백트래킹



<br>

#### 시간복잡도
- 2^11가지의 점수 획득 가능 여부를 탐색 (각 점수에 대해 화살을 쏠지 말지 선택).
- O(2^11), 상수크기

#### 공간복잡도
- 재귀호출 스택 O(11)
- ryan, info 배열 모두 11의 크기를 갖는다.
- O(11)
<br>

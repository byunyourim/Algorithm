https://school.programmers.co.kr/learn/courses/30/lessons/169199


## 재정의
- 상, 하, 좌, 우
- 장애물이나 게임판 가장자리까지 부딪힐 때까지 움직인다.
- 이것을 한 번 이동으로 한다.
- 목표 위치에 정확하게 멈추기 위해 최소 몇 번의 이동이 필요한지?

- "." : 빈 공간
- "R" : 로봇의 처음 위치
- "D" : 장애물의 위치
- "G" : 목표 지점

<img width="547" alt="image" src="https://github.com/user-attachments/assets/628b367a-f635-445d-acde-33396b15c074">

#### 예제1
<img width="141" alt="image" src="https://github.com/user-attachments/assets/512987a4-a8ff-435f-84b9-0c1b716a77fa">
<img width="419" alt="image" src="https://github.com/user-attachments/assets/42ab2017-8c01-4f4e-b94b-3ad9da8f3ac5">

#### 예제2
<img width="499" alt="image" src="https://github.com/user-attachments/assets/ee7d4dc7-3d26-427d-bdfe-681f693f878d">


**G의 주변에 벽이나, D가 있어야 한다. **

<br><br>

## 알고리즘
특정 위치에서 도착지점까지 가장 짧은 거리 구하기 -> 최단 길이 알고리즘(BFS?)
- 가중치가 없으므로 bfs로~, 큐 이용,

1. 시작위치를 찾는다.
2. G에 도달할 때 BFS의 깊이(=이동 횟수)를 반환합니다.
3. 특정 방향으로 이동 시 장애물 'D' 또는 게임판의 경계에 부딪힐 때까지 이동합니다.
4. 이동 후의 위치가 새로운 탐색 노드가 됩니다
5. 이미 방문한 위치는 다시 방문하지 않도록 관리합니다(예: visited 배열)
6. 목표 위치 G에 도달하면 현재 이동 횟수를 반환.
7. 탐색이 끝날 때까지 도달하지 못하면 -1을 반환.


#### 시간 복잡도
- BFS는 각 노드를 한 번씩 방문합니다.
- O(N * M)
#### 공간 복잡도
- visited 배열 및 BFS 큐의 크기
- O(N * M)

<br><br>

## 의사코드
```
1. 시작위치, 종료위치 설정
int[] start = new int[2];
int[] goal = new int[2];


2. BFS 탐색
큐가 비어있지 않는 동안 탐색
- 방문 체크 visited
- 상하좌우 방문

3. 경로가 없으면 -1

```

<br><br>

## 구현

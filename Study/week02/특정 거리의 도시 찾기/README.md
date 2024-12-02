https://www.acmicpc.net/problem/18352



<img width="767" alt="image" src="https://github.com/user-attachments/assets/33bac46e-0f03-4e6d-ab16-5bc9698c9044">


#### 알고리즘

- 시작점이 존재 하며, 모든 탐색이 아닌 최단 경로 탐색으로 bfs 이용

- 시작점이 존재 하며, 모든 탐색이 아닌 최단 경로 탐색으로 bfs 이용

1. 입력 받기
2. 인접리스트 만들기
3. bfs 탐색
4. 출발지로부터 거리가 k인 도시 반환



- 시간 복잡도
	- BFS  : 각 노드는 한 번 방문되며, 모든 간선을 확인
    - O(N + M)

- 공간복잡도
	- 그래프를 저장하는 인접리스트 O(N + M)
	- distance 배열 크기 n+1 O (N)
	- 최대 n 크기의 큐 O(N)
	- O(N + M)
  
#### 의사코드
생략

#### 구현


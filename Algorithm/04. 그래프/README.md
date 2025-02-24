## 그래프
노드와 엣지의 표현 

<img width="362" alt="image" src="https://github.com/user-attachments/assets/03f0484a-47fe-4722-9eff-a004c1d649e8">

<br><br><br>

### 그래프 표현 방법
#### 1. 엣지 리스트 (엣지를 중심으로 표현)
- 배열의 열 2개로 표현
  ##### 가중치가 없는 경우
  <img width="463" alt="image" src="https://github.com/user-attachments/assets/70630b58-599c-4c05-a18e-cb2517cd4af6">
  
  ##### 가중치가 있는 경우
  - 열을 하나 늘려주면 된다.
  - 벨만-포드, 크루스칼에서 사용
  <img width="290" alt="image" src="https://github.com/user-attachments/assets/100fd8b8-e3eb-47af-a97f-9a52ce8e43f1">

<br>

#### 2. 인접 행렬
2차원 배열을 자료 구조로 이용하여 그래프 표현  
- 노드가 적을 때 주로 사용  
- 노드에 비해 엣지의 개수가 적을 때 공간 효율성이 떨어진다.  

<br>

#### 3. 인접 리스트 (제일 중요)
ArrayList로 그래프를 표현
  ##### 가중치가 없는 경우
  ArrayList<Integer[]>로 선언
  
  <img width="500" alt="image" src="https://github.com/user-attachments/assets/34c2735d-5c72-49db-9e00-7a48a03046b0">
  
  ##### 가중치가 있는 경우
  <img width="394" alt="image" src="https://github.com/user-attachments/assets/ffe24ec8-7386-41f7-9e78-6eb229ec8e51">  
  
  Node : 종료 노드와, 가중치가 존재해야 한다.    
  - 구현에 복잡하지만 노드와 연결되어 있는 엣지를 탐색하는 시간이 뛰어나다.    
  - 빈 공간이 없어 메모리 효율이 뛰어나다.  
  
<br><br>

## 유니온 파인드
그래프의 사이클이 생성되는지 판별하는 알고리즘  
- 노드를 중심으로 그래프를 표현한다.  

<br><br>

## 위상 정렬
사이클이 없는 방향이 있는 그래프
- 노드를 정렬해주는 알고리즘
- 정렬 결과가 꼭 1개는 아니다.
- 전/후 관계 필요 (수강신청: 수1 -> 수2)

<br><br>

## 최단 거리 알고리즘
- 다익스트라
  - 시작 점 (s) 고정
  - 다른 모든 노드를 가는 최단 거리를 구하는 알고리즘
  - 음수 간선 X
- 벨만-포드
  - 시작 점 (s) 고정
  - 다른 모든 노드를 가는 최단 거리를 구하는 알고리즘
  - 음수 간선 O
  - 음수 사이클 확인 문제 - 시간여행, 웜홀, 음의 무한대로 갈 수 있는지
- 플로이드-워셜
  - 시작 점이 없다.
  - 모든 노드에 대한 최단 거리를 구한다.
  - 모든 도시간에 최단 거리 (도시는 100개 이하)


<br><br>
 
## 최소 신장 트리
- 최소의 비용으로 모든 노드 연결
- 사이클이 있으면 안된다. -> 유니온 파인드 필요
  

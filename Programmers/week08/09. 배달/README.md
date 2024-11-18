https://school.programmers.co.kr/learn/courses/30/lessons/12978

## 재정의
- 다익스트라 알고리즘 사용한 최단 거리 구하는 알고리즘
- 각 마을 -> 맵으로 표현
- 1에서 다른 모든 마을까지의 최단 경로 계산
- 배달 가능 시간 K이내에 도착할 수 있는 마을의 수

  
## 알고리즘
1. 마을 정보 -> 그래프로 구성
2. 다익스트라 알고리즘 수행
   - 우선 순위 큐 이용
   - 최단 거리 노드를 꺼내 최단 거리 계산
   - 갱신된 거리ㅣ가 최다ㅏㄴ 거리보다 작은 경우, 우선 순위 큐에 추가하여 다음 탐색 대상으로 한다.
4. K이하인 마을 수 계산



- 시간 복잡도
  - 그래프 초기화 O(E)
  - 다익스트라 O((V + E) * log V)
  - 따라서 **O((V + E) * log V)**

- 공간 복잡도
  - 그래프를 인접 리스트로 저장 : O(V + E)
  - 최단 배열 distance : O(V)
  - 우선 순위 큐 : 최악의 경우 O(V)
  - 따라서 **O(V + E)**


## 의사코드
```
dataMap = 인접 리스트 초기화
for a, b, c in road:
    dataMap[a].append((b, c))
    dataMap[b].append((a, c))

2: 최단 거리 배열 및 우선순위 큐 초기화
distances = [Infinity] * (N + 1)
distances[1] = 0
queue = PriorityQueue() # 최소 힙
queue.add((0, 1)) # (거리, 시작 마을)

3. 다익스트라 알고리즘
while queue is not empty:
  currentDistance, currentNode = queue.poll()
  
  if currentDistance > distances[currentNode]:
      continue
  
  for neighbor, weight in graph[currentNode]:
      distance = currentDistance + weight
      if distance < distances[neighbor]:
          distances[neighbor] = distance
          queue.add((distance, neighbor))

4: 배달 가능한 마을 수 계산
count = 0
for distance in distances:
  if distance <= K:
      count += 1
      
return count
```

## 구현

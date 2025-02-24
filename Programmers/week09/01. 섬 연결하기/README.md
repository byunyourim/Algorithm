https://school.programmers.co.kr/learn/courses/30/lessons/42861

## 재정의
- n 개의 섬 사이에 다리를 건설하는 비용
- 최소의 비용을 모든 섬이 통행 가능하도록 만들 때
- 필요한 최소 비용 return

## 알고리즘
최소 비용으로 모든 다리를 건널 수 있어야 하며 음수 비용이 들지 않음 -> 크루스칼

1. 최단 거리 테이블, distance 초기화, 우선 순위큐 초기화
2. 방문하지 않은 노드 중 가장 짧은 노드 선택 -> 방문 처리
3. 다음 노드로 넘어가는 가중치 계산 -> distance 업데이트

크루스칼 알고리즘은 간선(다리)의 비용을 기준으로 정렬한 후, 가장 적은 비용부터 선택하여 사이클이 발생하지 않도록 연결한다.
사이클을 체크하는 방법으로는 Union-Find(또는 Disjoint-Set) 자료구조를 사용한다.

<br>

- Union-Find 자료구조를 초기화
- 각 섬은 서로 다른 집합에 속하도록 한다.
- costs 배열을 비용을 기준으로 오름차순으로 정렬
- 가장 적은 비용의 다리부터 하나씩 선택하여, 이미 연결된 섬들이 사이클을 만들지 않는 경우 -> 선택
- 모든 섬을 연결할 때까지 다리를 선택하고, 그때까지의 비용을 계산한다.


####  시간 복잡도
- 간선 정렬: O(E log E) (E는 간선의 수)
- Union-Find 연산: O(α(n)) (α는 아커만 함수로 매우 느리게 증가, 거의 상수 시간)
- 따라서 시간 복잡도 : O(E log E)


https://school.programmers.co.kr/learn/courses/30/lessons/42892


## 재정의
프렌즈들을 두 팀으로 나눠, 같은 곳을 다른 순서로 방문하도록 해서 먼저 순회를 마친 팀이 승리한다.

- 방문할 곳의 2차원 좌표 값을 구하고 각 장소를 이진트리의 노드가 되도록 구성한 후, 순회 방법을 힌트로 종
팀이 스스로 경로를 찾도록 한다.




## 알고리즘
1. 노드 정보를 리스트로 반환 Node(x, y, value)
2. 노드 정렬 (1) y 내림차순, (2) x 오름차순
3. 트리 구성
4. 전위 순회, 후위 순회
5. 결과 반환



#### 시간복잡도
- 노드 리스트 정렬  O(N log N), 은 노드의 개수
- 노드를 이진트리에 삽입할 때, 각 노드 삽입은 트리의 깊이에 비례한다. 균형잡힌 트리의 경우 O(log N), 최악의 경우 O(N)이다.
- n개의 노드를 삽입하는 데 걸리는 시간 O(N log N)이고, 최악의 경우 O(N^2)
- 이진트리의 순회는 각 노드를 한 번씩 방문하기 때문에 O(N)
-  O(N log N),  O(N^2)
#### 공간복잡도
- 입력 배열과 노드 정보를 저장하는 리스트는 O(N)
- 트리는 노드의 개수에 비례하는 공간을 사용한다. O(N)
- 전위 순회, 후위 순회는 재귀적으로 구현된다. 호출 스택에 추가 공간 O(log N), O(N)이 필요함
- <br>
   
## 의사코드
```
노드 클래스 {
  x, y, value, left, right
}

1. nodeinfo -> List<Node> nodes


2. nodes.sort();


3.
root = nodes.get(0);
for (nodes) {
    insertNode(root, nodes.get(i));
}

4. preorder(root), postorder(root) 호출

5. return answer[][]

```


## 구현

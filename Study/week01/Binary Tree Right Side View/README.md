[Binary Tree Right Side View](https://docs.google.com/document/d/1FhTnuYbfNrcSrUERehq6Kpq6RkMCglE3mT9Zuvq9eNA/edit?tab=t.0)



<img width="528" alt="image" src="https://github.com/user-attachments/assets/2abf6b2a-63bf-4450-b02b-27483c439966">


## 문제 
- 이진 트리의 root가 주어졌을 때, 이 트리를 오른쪽에서 바라봤을때, value들을 위에서부터 차례로 출력하기.
- 노드의 개수는 [0, 100] 범위
- 100 <= Node.val <= 100


## 문제풀이
그래프의 레벨 단위로 탐색을 하여, 가장 오른쪽에 있는 노드를 찾아야 한다. 
bfs는 같은 레벨의 노드를 모두 탐색한 후 다음 레벨로 넘어가는 방법으로 가장 오른쪽 노드를 찾을 수 있음

<br>
0. root가 빈 경우 return 
1. 트리의 각 레벨의 왼쪽에서 오른쪽으로 탐색하면서, 가장 오른쪽 노드 저장한다.
- 각 레벨의 가장 오른쪽 노드는 가장 마지막으로 처리됨!

#### 시간복잡도
- 모든 노드 한 번만 탐색
- O(N)

  
#### 공간복잡도
- 큐의 노드의 수 N
- 최악의 경우 (완전 이진 트리) O(N)



## 의사코드
```
List<Integer> result 결과 리스트

if(root가 빈 경우) return result;

Queue<TreeNode> q
q.add(root);

while (!q.isEmpty()) {
  int size  큐의 현재 레벨의 크기
  TreeNode right 오른쪽에 있는 마지막 노드

  for (i ~ size 레벨의 사이즈만큼 순회) {
    현재 노드 node = queue.poll();
    
    if (값이 있으면) {
      right = node; 가장 오른쪽 노드
      if 현재 노드의 좌, 우 자식 노드 큐에 각각 추가 
    }
  }
  if (right != null) result에 추가
}
return result



https://school.programmers.co.kr/learn/courses/30/lessons/169198


## 재정의
가장 짧은 거리 구하기


## 알고리즘
- 공을 벽에 반사시켜 도착지까지 가는 최단 거리 구하기, bfs
- 4가지의 방향으로 구해야 함
- 반사거리를 구하기 위해 확장해서 구함

#### 시간 복잡도
- balls의 배열의 크기만큼 반복한다.
- 각 목표지점에 대해 상하좌우 4번 연산
- O(K)
#### 공간 복잡도
- answer 배열이 k 길이만큼 할당
- 그 외 변수는 상수 공간을 사용한다.
- O(K)
## 의사코드
```

targetx, targety 목표 지점

0. 같은 선상에 있지 않아야 함

1. 오른쪽 반사
목표위치 = (2 * m - targetx, targetY)
거리 = distance (시작 위치, 목표위치)

2. 위쪽 반사
목표위치 = (targetX, 2 * n - targetY)
거리 = distance (시작 위치, 목표위치)

3. 왼쪽 반사
목표위치 = (startX, startY, -targetX, targetY)
거리 = distance (시작 위치, 목표위치)

4. 아래쪽 반사
목표위치 = (startX, startY, targetX, -targetY)
거리 = distance (시작 위치, 목표위치)


return result;
```

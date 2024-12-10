https://school.programmers.co.kr/learn/courses/30/lessons/1829


## 재정의
- 그림의 난이도를 영역의 수로 설정, (상하좌우로 연결된 같은 색의 공간을 같은 영역이라고 본다)
- 그림에 존재하는 영역의 수와 가장 큰 영역의 넓이 구하기

<br>

## 알고리즘
0. bfs 탐색
1. 같은 수가 상하좌우로 인접해있는 경우 같은 그룹
2. 그룹에 속하는 count 확인
3. count 최대값
4. return 


<br>

#### 시간복잡도
- bfs탐색, 최악의 경우 O(m * n)


#### 공간복잡도
- 방문배열의 크기 O(m * n)
- bfs 탐색을 위한 큐 O(m * n)
- 그 외는 상수값
- O(m * n)
<br>

## 의사코드
```
void solution {

  for (0 ~ m) {
    for (0 ~ n) {
      if 방문하지 않고, 0이 아닌 경우 {
        numberOfArea++;
        size = bfs();
        maxSizeOfOneArea
      }
    }
  }
  return new int[] {numberOfArea, maxSizeOfOneArea}; 
}

int bfs {
  큐에 위치 추가
  while (큐가 비어있지 않은 경우) {
    상하좌우로 같은 컬러가 인접한 경우 -> size++;
  }
  return size;
}
```


<br>

## 구현

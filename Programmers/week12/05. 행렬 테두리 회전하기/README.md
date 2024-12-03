https://school.programmers.co.kr/learn/courses/30/lessons/77485



## 재정의
- 행rows, 열columns, 그리고 회전 목록 queries가 주어질 때, 각 회전들을 배열에 적용
- 회전에 의해 위치가 바뀐 숫자들 중 가장 작은 숫자들을 순서대로 배열에 담아 return


## 알고리즘
1. 배열 생성
2. 회전
3. 최소값 찾기

#### 시간 복잡도
- 외부 for는 queries의 수만큼 순회 O(N) , N은 queries의 길이
- rotate() 각 변의 길이에 비례해서 반복 최대 matrix의 가로 세로 길이 합 O(W + H)
- O(N * (W + H))
#### 공간 복잡도
- matrix 배열 생성, 행렬의 크기만큼 메모리 사용 O(W * H)
- 최소값을 답을 리스트 O(N), N은 큐의 길이
- O(N + (W * H))

## 의사코드
```
solution {
    1. 배열 생성
    int count = 1;
    matrix[][] = new int[rows][cols];
    for (matrix에 count 증가시키면서 넣기) {
      matrix = count+;
    }
    
    // 배열 회전
    for(query 만큼) {
    
      int min = rotate();
    
      result.add(min);
    }
    
    return list -> 배열로;
}

int rotate () {
    회전 로직
    int temp  = 시작 인덱스

    for () {'
      1. 각 변마다 회전
      2. 최소값 구하기 min
    }  

    return min
}

```



## 구현

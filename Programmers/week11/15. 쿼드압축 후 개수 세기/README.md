https://school.programmers.co.kr/learn/courses/30/lessons/68936

<br>

## 재정의
- 0과 1로 이루어진 2n x 2n 크기의 2차원 정수 배열 arr
- 특정 영역의 내부의 수가 모두 같은 값이라면, 해당 수를 하나로 압축시킨다.
- 그렇지 않면, 정확히 4개의 균일한 정사각형 영역으로 쪼갠 뒤, 각 정사각형 영역에 대해 같은 방식의 압축을 시도한다.
- 배열에 최종적으로 남는 0의 갯수와 1의 갯수를 배열에 담아서 return 
<img width="693" alt="image" src="https://github.com/user-attachments/assets/56725486-7807-4ded-a9ac-533e97e34857">





<br>

## 알고리즘
1. 배열이 통일되었는지 확인
2. 통일되지 않으면 정사각형 배열을 같은 크기로 4분할한다.
3. 배열이 더이상 나누어지지 않으면 0과 1의 개수를 결과로 반환한다.


<br>

#### 시간복잡도
- isUniform : O(각 영역 size?)
- 분할 및 재귀호출 : logN
- O(N^2logN)
#### 공간복잡도
- 재귀호출 공간 O(logN)

<br>

## 의사코드
```
func solution : {
  compress ( )
}

func compress (arr, x, y, length) : {
  if 통합되어있는지 확인 isUniform
      if 0이면 return new int {1, 0}
      if 1이면 return new int {0, 1}

  arr 4개의 영역으로 분할
  1. topleft : compress();
  2. topright : compress();
  3. bottomleft : compress();
  4. bottomright : compress();

  return new int {0 개수, 1 개수};
 
}

func isUniform (arr, x, y, length): {
  int v = arr[x][y] 첫번째 값
  for (rows) {
    for (cols) {
      arr[i][j]가 v와 다르면 return false;
    }
  } return true;
}

```

<br>

## 구현

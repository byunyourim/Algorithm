https://school.programmers.co.kr/learn/courses/30/lessons/340212

<br>

## 재정의
- n개의 퍼즐 제한 시간 내에 풀기
- 난이도 diff,
- 현재 퍼즐 소요시간 time_cur,
- 이전 퍼즐 소요시간 time_prev
- 숙련도 level
- 전체 제한시간 limit, 제한 시간 내에 모든 퍼즐을 해결하기 위한 숙련도의 최솟값 구하기, 다 양의 정수임

- diff <= level이면 퍼즐을 틀리지 않고 time_cur만큼 시간을 사용하여 해결한다.
- diff > level이면
  - 퍼즐을 총 diff-level(mistake) 만큼 틀린다.
  - 틀릴때마다 time_cur을 사용하며, 추가로 time_prev만큼 사용한다.
- 이전 퍼즐을 다시 푸는 경우, 난이도에 상관없이 틀리지 않는다. diff-level 번 틀린 이후 다시 퍼즐 풀면 time_cur만큼 시간을 사용해 퍼즐을 푼다.


<br>

## 알고리즘
0. 숙련도의 최솟값 -> 이분탐색
1. 퍼즐의 개수만큼 반복문 순회
2. diff와 level 비교
3. 최소level 찾기

<br>

#### 시간복잡도
- 최소 숙련도를 탐색하는 범위, 최악의 경우 O(log(max))
- 시간 계산 퍼즐의 개수 n만큼 탐색 O(n)
- O(n * log(max))

#### 공간복잡도
- 배열 및 변수만 사용, O(1)

<br>

## 의사코드
```
solution : {
  left = 1, right = 1000000;
  while (mid < right) {
    mid = (left + right) / 2;
    if (calculateTime <= limit) right = mid;
    else left = mid + 1;
  }
  return left;
}

calculateTime : {
  totalTime = 0;
  for (diff.length) {
    if (diff < level) totalTime += times;
    else {
        mistake = diff - level
        totaltime = mistakke * (times_prev + times_cur) _ times_cur;
    }
  }

}

```



<br>

## 구현

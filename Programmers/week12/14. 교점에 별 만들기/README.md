https://school.programmers.co.kr/learn/courses/30/lessons/87377

<br>

## 재정의
- Ax + By + C = 0으로 표현할 수 있는 n개의 직선
- 이 직선의 교점 중 정수 좌표에 별 그리자



<br>

## 알고리즘
1. 모든 정수인 교점을 찾는다. (완전 탐색)
2. 별을 찍는다.


#### 시간 복잡도
- line 배열에 대해 두 개의 중첩된 for문,
- 첫 번째 루프는 line.length - 1까지 반복하고, 두 번째 루프는 그보다 작은 범위, 대략 O(n^2)
- drawStar(), O(height * m)
#### 공간 복잡도
- starSet에 모든 좌표, O(n^2)
- answer배열은 height * width 크기의 문자열 배열 O(height * width)
- O(n^2+ height * width)
<br>

## 의사코드
```
모든 접점 찾기
for {
  for {
    if 두 선이 평행이 아닌 경우 {
        set.add(접점)

        x, y 의 최대 최소 값
    }
      
  }
}

별 좌표 찍기

```



<br>

## 구현

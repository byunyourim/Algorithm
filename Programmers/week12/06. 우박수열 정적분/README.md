https://school.programmers.co.kr/learn/courses/30/lessons/134239

## 재정의
<img width="743" alt="image" src="https://github.com/user-attachments/assets/42eaedc6-a20f-4b02-b4e5-f15a8f1a2313">


- 그래프 구간에 맞게 넓이 구하기~

<br>

## 알고리즘
1. 꼭짓점을 구한다. 처리 횟수 증가
2. 그 거리만큼 넓이를 구한다.
3. range를 돌며 넓이 계산


<br>

#### 시간복잡도
- 우박 수열 생성 및 넓이를 구하는 과정, N은 수열의 길이
- 우박 수열은 k에서 시작하여 1에 도달할 때까지 계산
- 구간합을 구하는 과정은 ranges의 개수만큼 반복한다.O(M), M ranges의 개수
- O( N + M)
#### 공간복잡도
- 구간합을 더할 리스트 우박수열 그래플의 길이만큼 O(N), N은 수열의 길이
- 결과를 저장하는 배열은 ranges의 길이만큼 메모리를 사용한다. O(M)
- O(N + M)
<br>

## 의사코드
```
List<Integer> data = 구간별 넓이 저장
while (k != 1) {
  k 짝수인 경우 : 2로 나누기
  k 홀수인 경우 : 3 곱하기

  넓이 구하기 
  data.add ((이전 변의 길이 + 현재 변의 길이) / 2);
  
}

for (ranges) {
  구간별 넓이 구하기
}

배열로 반환
```



<br>

## 구현

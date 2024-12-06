https://school.programmers.co.kr/learn/courses/30/lessons/72412

## 재정의
- [조건]을 만족하는 사람 중 코딩테스트 점수를 X점 이상 받은 사람은 모두 몇 명인가?


<br>

## 알고리즘
1. 지원자 정보 키 맵 생성, (완전 탐색)
2. 조건에 맞는 지원자 찾기
3. 결과 배열로 리턴 



<br>

#### 시간복잡도
- 탐색 : info 배열 순회, 중첩 for문을 통해 key 생성 O(n * k)
- 정렬, : 각 리스트를 정렬: O(k * m log m), (k: map의 키 개수, m: 각 리스트 평균 길이)
- 조건 : 쿼리 수 q개, 각 쿼리에서 이진 탐색: O(q * log m)
- O(k * m log m + q * log m)

#### 공간복잡도
- map에 k * m개의 점수를 저장한다 O(k * m)
- 정렬시 추가 메모리 사용 O(m) (각 리스트당)
- O(k * m)

<br>

## 의사코드
```
Map<String, List> map
for (infos) {
  info 피싱
  key = 모든 키의 조합 생성
  map.put(key, score);
}

map의 value 정렬

for (key) {
  조건 키
  if map에 조건키가 존재한다면 {
    value를 이진탐색하여 수를 찾아낸다.
  }
}

return result;
```

<br>

## 구현

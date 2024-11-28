https://school.programmers.co.kr/learn/courses/30/lessons/72411

<br>

## 재정의
- 각 손님은 단품 메뉴를 2가지 이상 주문해야 한다.
- 최소 두 명 이상이 손님에게 주문된 구성이어야 코스요리 후보에 들 수 있다.
- 스카피가 새로 추가하게 될 코스요리 구성 리턴.



<img width="691" alt="image" src="https://github.com/user-attachments/assets/ba99be10-d845-4aa6-8a4e-fbdc70994b27">

<br>

## 알고리즘
- 코스가 n개인 경우
- orders를 돌며 모든 조합을 Map에 넣는다. 갯수 확인
- 2개 이상인 경우 코스 후보가 될 수 있다.


1. orders 각각으로 2, 3, 4개 조합 생성
2. 조합이 >=2 인 경우 코스 후부에 추가 

#### 시간복잡도
- 조합 생성 : 문자열 최대길이, 주문 갯수, 조합 -> O(T * n^r)
- 정렬 : O(M log M)
- O(T * n^r + MlogM)
#### 공간복잡도
- 조합 저장 O(M), 생성된 모든 조합
- 재귀 O(r), 조합의 최대 크기
- 결과 O(M), 최종 결과
- O(K + r + M)



<br>

## 의사코드 
```
Map<String, Integer> orderMap = 요리의 조합 
for (course) {
  for (orders) {
    String order = 요리의 조합 생성;
    orderMap.add(order, +1);
  }
}

List<String> courses = 코스요리 후보들
for (o : orderMap) {
  if (o.value >=2)
  list.add(o.key);
}

return list.toArray 오름차순으로 정렬해서 리턴
```
<br>

## 구현




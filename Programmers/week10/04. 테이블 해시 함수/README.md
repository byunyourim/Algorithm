https://school.programmers.co.kr/learn/courses/30/lessons/147354


<br><br>

## 재정의
- 테이블은 모두 정수 컬럼으로 이루어져 있다.
- 2차원 행렬로 표현할 수 있다.
- 열은 컬럼, 행은 튜플을 나타낸다.
- 첫 번째 컬럼은 기본키로, 모든 튜플에 대해 그 값이 중복되지 않도록 보장한다.
- col 번째 컬럼을 기준으로 오름차순 정렬
- 값이 동일한 경우 첫 번째 컬럼의 값을 기준으로 내림차순 정렬
- S_i = i 번째 행의 튜플에 대해 각 컬럼의 값을 i 로 나눈 나머지들의 합
- row_begin ≤ i ≤ row_end 인 모든 S_i를 누적하여 bitwise XOR 한 값을 해시 값으로서 반환.
- 테이블의 해시값 리턴




<img width="500" alt="image" src="https://github.com/user-attachments/assets/923f73d0-9e28-46ad-a84f-104aff38eed6">




<br><br>

## 알고리즘
1. 정해진 방법에 따라 튜플 정렬
2. 모든 S_i 구하기 리스트?
3. bitwise XOR 한 해시값 반환
4. 다 더하기

#### 시간 복잡도 : 
- 정렬시간 : Arrays.sort는 최악의 경우 **O(M log M)**.(M,data의 행의 개수)
- 중첩 반복문 : O(M×N)
- XOR 연산 부분 :  최악의 경우 O(M)
- O(MlogM + M×N)
#### 공간 복잡도
- dataList: O(M) (행의 수만큼 저장)
- 추가적인 상수 공간 사용(예: remain, index, answer)
- O(M)


<br><br>

## 의사코드
```
1.col에 대해 오름 차순 정렬, 동일한 경우 첫 번째 칼럼 기준으로 내림차순 정렬

2. S_i 구하기
for (list) {
  sumlist = S_i
}

int result = 0;
3. sumlist의 xor 구하기
result ^= b

return result;
```






<br><br>

## 구현

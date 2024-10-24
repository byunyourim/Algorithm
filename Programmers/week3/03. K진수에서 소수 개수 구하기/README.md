## 문제 이해하기

<br><br>

## 재정의
1. k 진수 변환
2. 0으로 자르기
3. 소수 판별

<br><br>

## 알고리즘
시간복잡도 : O(log n) * O(√p)

진수변환 : O(log n)
소수판별 : O(√p)

<br><br>

## 의사코드
```
count 소수의 개수  
value = Integer.toString(n, k)   k 진수로 변환한 수  

int[] numbers = value를 0으로 자른 배열  
for (number : numbers) {  
    소수인지 확인  
    if (소수인경우) count++;  
}
```
count 반환  

<br><br>

## 구현

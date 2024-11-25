https://school.programmers.co.kr/learn/courses/30/lessons/42895

## 재정의
- N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값 return 
<img width="625" alt="image" src="https://github.com/user-attachments/assets/50b4f5f7-f01b-45e8-a1be-42aea1013d5e">



## 알고리즘
1. n과 number이 같은 경우 return 1
2. dp배열 생성
3. 곱셈, 덧셈, 뺄셈, 나눗셈 수행하여 dp배열에 넣기
4. 가장 작은 횟수 반환
5. 최솟값이 8보타 크면 -1 반환


## 의사코드
```
if (n과 number같으면 ) return 1;

dp배열 생성 : 9크기
for (0~9) {
  dp배열 세팅
}

dp[1].add(N);

dp[8]까지 반복
for (i : 2 ~ 8) {
  for (1 ~ j) {
    for(dp[j]) {
      for (dp[i-j])
        1. 덧셈, 2. 뺄셈, 3. 곱셈, 4. 나눗셈;
    }
  }

  dp 에 추가한다. 
} 

```

## 구현

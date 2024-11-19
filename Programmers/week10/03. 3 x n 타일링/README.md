<img width="278" alt="image" src="https://github.com/user-attachments/assets/0811aa99-050a-4628-93e1-38fdc0123669">https://school.programmers.co.kr/learn/courses/30/lessons/12902


## 재정의
- 가로 길이 : 2, 세로 길이 : 1 인 직사각형
- 이 타일을 이용하여 세로의 길이가 3이고 가로의 길이가 n인 바닥을 가득 채운다.
- 채우는 방법
  - 타일을 가로로 배치하는 방법
  - 타일을 세로로 배치하는 방법
-  **이 직사각형을 채우는 방법의 수는?**


<br><br>

## 알고리즘
- dp.. 점화식을 찾아야하는데..
- 배치하는 방법에는 가로로 놓는 법과 세로로 놓는 법이 있다.
- 그리고 가로가 홀수일때는 완벽하게 채우는게 불가능하다.

### n=2 만들 수 있는 조합 : 3가지
<img width="300" alt="image" src="https://github.com/user-attachments/assets/2a3c7efa-fe43-475a-80db-caea156e7877">


### n=4 만들 수 있는 조합 : 11가지
**n=2의 조합과 각각 3가지 모양이 더 추가된다. f(n-2) x 3이다.**
 
추가로 아래의 모양이 2개 추가된다.   

<img width="300" alt="image" src="https://github.com/user-attachments/assets/7d7558a2-1220-48cc-96a8-0307c37af367">
    
    

### n=6 만들 수 있는 조합 : 41가지
**n=4의 조합과 각각 3가지 모양 f(n-2) x 3이다.**
#### 아래의 두 가지 방법 추가
<img width="296" alt="image" src="https://github.com/user-attachments/assets/e45cd911-314e-4762-9dfc-e7790aaf9b55">

#### 아래의 방법 추가
- 2(f2)
<img width="246" alt="image" src="https://github.com/user-attachments/assets/27e9fe87-7879-4e84-bcd1-0ee24e724cb4">






    



<br><br>

### 점화식       
<img width="613" alt="image" src="https://github.com/user-attachments/assets/2b48eb69-a74d-4da8-8a52-e9e565162880">
- f(0) = 2;
- f(2) = 3;


#### 시간 복잡도
- n/2 만큼 for 문 반복하고 그 안에 (n/2 - 2) 만큼 반복한다.
- 안쪽 루프는 i - 4부터 0까지 2씩 감소한다. i에 따라 반복 횟수가 달라지며, 최대i/2−2번 반복한다.
-  O(n^2)
  
#### 공간 복잡도
- dp의 크기: n + 1 
- O(n)

  
<br><br>

## 의사코드
```
int[] dp = new int[n + 1];

dp[0] 일 때 1
dp[2] 일 때 3; 
for (int i = 2; i < n; i+=2) {
    dp[i] = dp[i - 2] * 3;
    for (int j = i - 4; j >= 0; j -= 2) {
      dp[i] += (dp[j] * 2);
    }
    dp[i] %= 1000000007;
    
}
dp [n] 리턴

```




<br><br>

## 구현

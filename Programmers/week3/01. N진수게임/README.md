https://school.programmers.co.kr/learn/courses/30/lessons/17687

## 1. 문제이해
진법 n, 미리 구할 숫자의 갯수 t, 게임에 참가하는 인원 m, 튜브의 순서 p 가 주어진다.

2 ≦ n ≦ 16
0 ＜ t ≦ 1000
2 ≦ m ≦ 100
1 ≦ p ≦ m  

  
<img width="481" alt="image" src="https://github.com/user-attachments/assets/7164d8ec-3d85-462d-9f58-b98eaea623e7">


<br><br><br>

## 2. 재정의
숫개의 갯수 t 배열
참가인원 m 
튜브 순서 p

총 배열을 구해야 할까?
총 배열의 크기 : t * m

0부터 순서대로 숫자 말함
튜브 순서에 있는 숫자들을 빼온다
n진법 으로 변경한다.

<br><br><br>

## 3. 알고리즘
시간복잡도 : O(t*m)


<br><br><br>

## 4. 슈도코드
```
result = 튜브의 수
total = 전체 반복 수
number = 0;
while (total의 길이 < t * m) {
  total += number의 진법변환한 수
}

for (i = 0; i < t; i++) {
  result += 튜브의 순번 ( i * m + p)
}
```

<br><br><br>

## 5. 구현

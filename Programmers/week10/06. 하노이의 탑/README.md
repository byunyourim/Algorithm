https://school.programmers.co.kr/learn/courses/30/lessons/12946

<br><br>



## 재정의
- 한 번에 하나의 원판만 옮길 수 있다.
- 큰 원판이 작은 원판 위에 있어서는 안된다.
- 현재 n개의 원판이 1번에 있다. 
- n개의 원판을 3번 원판으로 최소 횟수로 옮기려고 한다.

<img width="300" alt="image" src="https://github.com/user-attachments/assets/8c16b476-076e-47a1-833b-c770587d8c46">


<br><br>

## 알고리즘
#### 점화식
- move(cnt - 1, start, end, mid);
- arr.add(new int[]{start, end});
- move(cnt - 1, mid, start, end);




<br><br>

#### 시간 복잡도
- 하노이의 탑 문제의 시간 복잡도는 T(n)=2^n -1 이다. 
  <img width="130" alt="image" src="https://github.com/user-attachments/assets/3b0e2853-fc96-4ba9-92b7-d94c2bb3121b">
- O(2^n)
#### 공간 복잡도
- 재귀 호출은 최대 n번 중첩된다. 따라서 재귀 호출의 공간 복잡도는 **O(n)**이다.
- list에 옮기는 작업이 다 저장된다. 따라서 총 횟수는 2^n - 1이다. 따라서 O(2^n) 
- O(2^n)

<br><br>

## 의사코드
```
List<int[]> list = 이동 정보를 저장할 리스트
solution (n) {
   move(n, 1, 2, 3);
   
   int[][] answer = list.toArry();

   return answer;
}

move (int n, int start, int end, int mid) {
  if (n이 0인 경우) return 0;

  move (n - 1, start, end, mid);
  list.add(new int[]{start, end});
  move (n - 1, mid, start, end);
}
```


<br><br>

## 구현

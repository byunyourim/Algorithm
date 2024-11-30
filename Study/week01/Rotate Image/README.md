https://leetcode.com/problems/rotate-image/description/


<br>
   
**추가적인 메모리 공간이 거의(아예가 아니다) 안들도록 구현하기.**

<br>

<img width="618" alt="image" src="https://github.com/user-attachments/assets/c287dad3-f01a-4b32-bccd-be24f85bacec">





<br>

#### 문제풀이
0. 추가적인 배열 선언없이 구현해야 한다.
1. 임시변수 temp  = matrix[i][j]
2. - matrix[i][j] = matrix[n-1-j][i];
   - matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
   - matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
   - matrix[j][n-1-i] = temp;

#### 시간복잡도
- 외부 for : 0~n/2-1까지 반복 -> N(n/2), n은 행렬의 크기
- 내부 for : i~n-1-i까지 반복 -> 대락, N(n)
- O(n^2)
#### 공간복잡도
- n-place로 행렬을 회전시키며, 추가적인 공간을 사용않음
- O(1)

<br>

#### 의사코드
```java
for (i : matrix.length/2) { 행 길이의 반, 왜냐면 돌리니까~
  for (j : i ~ matrix[0].length-1-i) { 1. 행이 증가할 수록, 움직여야할 열의 개수가 줄어든다.
    temp =  matrix[i][j]

    matrix[i][j] = matrix[n-1-j][i];
    matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
    matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
    matrix[j][n-1-i] = temp;
  }
}

```

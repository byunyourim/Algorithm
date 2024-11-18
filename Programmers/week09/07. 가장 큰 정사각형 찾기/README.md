https://school.programmers.co.kr/learn/courses/30/lessons/12905

## 재정의
- 표에서 가장 큰 정사각형을 찾아 넓이를 return 해라


## 알고리즘
정사각형이 되기 위해서는 [i][j] 기준으로  
- board[i-1][i-j], board[i-1][j], board[i][j-1]이 다 1이어야 한다.
- 그러면 [i][j]를 최솟값 + 1로 세팅한다.
- <img width="313" alt="image" src="https://github.com/user-attachments/assets/2e16f425-5e35-44df-aa4c-18dd51328b8f">
- 정사각형의 가장 우측 하단의 값이 최대 변의 길이가 된다. 



## 의사코드



## 구현

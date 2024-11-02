## 방문길이
https://school.programmers.co.kr/learn/courses/30/lessons/49994
- 소요시간 : 38


## 재정의
- U: 위쪽으로 한 칸 가기

- D: 아래쪽으로 한 칸 가기

- R: 오른쪽으로 한 칸 가기

- L: 왼쪽으로 한 칸 가기
  
**캐릭터가 처음 걸어본 길 구하기**

단, 좌표평면의 경계를 넘어가는 명령어는 무시한다.x : -5 ~ 5, y: -5 ~ 5


## 알고리즘
1. (0,0)에서 시작한다.
2. 명령어에 따라 움직인다.
3. 처음 가는 길인 경우 +1
4. 가본 길인 경우 넘어감
5. 범위를 벗어난 경우 넘어감
6. 명령어의 수만큼 반복


(출발위치, 도착위치) 중복체크
- 다녀간 길인지 체크를 해야 함.
- 해시맵??

## 의사코드
```
int result = 0;
int idx = 0;
초기 위치
int[] loc = [0, 0];

명령어 미리 세팅 

HashSet 이미 다녀간 길인지 확인하는 맵
while (idx < dirs.length();) {
    String cmd = String.valueOf(dirs.charAt(idx));
    int x, y 이동한 위치
    if (cmd.equals("U") {
       y = loc[1] + 1;
    }
    if (cmd.equals("D") {
       y = loc[1] - 1;
    }
    if (cmd.equals("R") {
       x = loc[0] + 1;
    }
    if (cmd.equals("L") {
       x = loc[0] - 1;
    }

    if (새로운 길인 경우) :  set에 넣고, result++; 
    if (범위를 벗어나는 경우) : continue;  

    loc세팅

    idx++;
}

```

## 구현

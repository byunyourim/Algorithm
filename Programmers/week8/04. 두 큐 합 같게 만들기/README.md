https://school.programmers.co.kr/learn/courses/30/lessons/118667

## 재정의
- 길이가 같은 두 개의 큐
- 한 번의 pop + 한 번 insert = 1회
- 각 큐의 원소합이 같도록 만들기
- 필요한 작업의 최소 횟수
- long type 고려 


## 알고리즘
1. 큐의 총 합 구하기
2. 만들어야 할 큐의 값 = 큐의 총 합 / 2
3. 큐 1의 합 확인
4. 큐 1의 값을 빼면서 큐 2에 넣는다
5. 큐 2의 값을 뺏서 큐 1에 넣는다
6. 합계 확인
7. 큐 1을 기준으로
8. 한 번 돌때 cnt + 1


## 의사코드
```
qSum1
qSum2
queueTotal
makeValue = queueTotal / 2;
int cnt = 0;
int idx = 0;
while (idx < queue.length() * 2 && 값이 같지 않을 때 ) {
    if (qSum > makeValue)
        큐1에서 하나 빼고, 큐2에 넣기
        cnt++;
   
    if (qSum < makeValue)
        큐2에서 하나 빼고, 큐1에 넣기
        cnt++;

    if (qSum = makeValue) return cnt;
    idx++;
}
return -1;
```



## 구현

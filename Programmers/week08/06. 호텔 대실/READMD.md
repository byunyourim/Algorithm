https://school.programmers.co.kr/learn/courses/30/lessons/155651

## 재정의
- 한 번 사용한 객실은 퇴실 시간을 기준으로 10분간 청소를 하고 다음 손님들이 사용할 수 있다ㅏ.
- 예약 시간이 자정을 넘는 경우는 없다.
- 필요한 최소의 객실 수 구하기


## 알고리즘
0. 시간 변환 : 이용 시간은 [시작시간 ~ 종료시간 + 10]
1. 시작 시간으로 정렬
3. 다음 예약의 시작 시간이 퇴실시간보다 늦으면 1
4. 큐에 넣은 큐 남은 큐의 크기 -> 필요한 방 크기



### 시간/공간 복잡도
- 시간 복잡도
  - 시간 변환을 위해 book_time의 수 만큼 for문을 도는 시간 : n
  - 예약을 위해 큐에서 값을 꺼내거나 넣는 연산은 O(log n)의 시간이 걸린다. 예약 수(n)만큼 for를 돌아 큐에 넣고 꺼내기 때문에 O(n log n)이 걸린다.
  O(n + nlogn) = O(2n) 으로 따라서 시간 복잡도는 O(nlogn)이다.
- 공간 복잡도
  - 큐에는 최대 n개의 종료 시간을 넣을 수 있다.예따라서 공간 복잡도는 O(n)이다.
  - 또한 예약의 시작과 종료 시간을 저장하는 리스트는 예약의 수인 n에 비례한다.O(n)
  - 따라서 공간 복잡도는 O(n)이다.


## 의사코드
```
1. 시간 변환: 시작시간, 종료 시간 + 10 -> 정수로 변경

2. 예약 시간 정렬: 시작시간으로 정렬

3. 방 최소 개수 세기
Map booking <roomNum, 종료시간>

우선 순위 큐 roomEndTime -> 종료시간이 빠른 순서로 나ㅏ온다.
for (booking) {
    if (roomEndTime이 비어있지 않고, 다음 예약 시작 시간보다 빠른 경우) {
        roomEndTime.poll();
    }
     roomEndTime.add(end);
}
return roomEndTime.size();

```


## 구현

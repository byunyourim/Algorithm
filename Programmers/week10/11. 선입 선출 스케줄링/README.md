https://school.programmers.co.kr/learn/courses/30/lessons/12920


<br><br>

## 재정의
- 처리해야 할 동일한 작업 n개와 이를 처리할 CPU
- CPU에 여러 개의 코어가 있음
- 코어별로 한 작업을 처리하는 시간이 다르다.
- 한 코어에서 작업이 끝나면 작업이 없는 코어가 바로 다음 작업을 수행합니다.
- 2개 이상의 코어가 남을 경우 앞의 코어부터 작업을 처리 합니다.
- 마지막 작업을 처리하는 코어의 번호를 return
<img width="644" alt="image" src="https://github.com/user-attachments/assets/477a97db-903c-4abd-bf62-e76324cc5f46">

<br><br>

## 알고리즘
전에 디스크 컨트롤러 문제와 비슷한 것 같다 ->> 이진탐색
- 죄소 시간 : 0
- 최대 시간 : cores[x] * n , 가장 느린 코어가 모든 작업을 처리


#### 시간 복잡도
- 이진 탐색 O(logN)
- 총 작업 탐색 O(T)
- O(T * logN)

#### 공간 복잡도
- 상수 공간 사용 O(1)


<br><br>
## 의사코드
```
작업 분배에 소요되는 최소 시간과 최대 시간을 계산:

left : 최소 시간 0
right : 최대 시간 

while ( left <= right ) {
   int mid = (left + right) / 2;
   int totalTask = 0;

   for (cores) {
      totalTask += mid / core + 1
   }


   if (totalTask >= n) {
      time = mid;
      right = mid -1;
   } else : left = mid + 1;

}


최소 시간 만큼 작업 처리
for (cores) {
   tasksProcessed += (time-1 / core) + 1
}  

남은 작업 분배하며, 마지막 작업이 할당된 코어를 확인.
for (cores) {
    if 현재 시간이 코어의 처리 시간 배수일 때 -> 새 작업을 시작할 수 있는 시간인지ㅣ ㅣ확인
        작업수 줄이고
         if : 남은 시간이 0이면 return 코어 벊
} 

```

<br><br>

## 구현

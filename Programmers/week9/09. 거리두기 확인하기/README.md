https://school.programmers.co.kr/learn/courses/30/lessons/81302#fn1

## 재정의
- 대기실은 5개, 5 X 5의 크기를 갖는다.
- 맨해튼 거리4ㅏ 2이하로 앉으면 안된다.
- 단, 파티션으로 막힌 경우 괜찮음

- P는 응시자가 앉아있는 자리를 의미합니다.
- O는 빈 테이블을 의미합니다.
- X는 파티션을 의미합니다.
- 거리 준수하며 앉은 경우 1, 아닌 경우 0 반환
 
<br>


## 알고리즘
P와 P 사이 팬해튼 거리를 확인한다. 
1. 응시자의 위치 확인
2. 응시자 간 거리 확인
3. 2 이하인 경우 -> 파티션의 존재 유무 확인
4. 파티션 존재하지 않으면 -> return false;

#### 시간 복잡도 : 응사자의 위치 + 거리 검사 O(n^2)
#### 공간 복잡도 : O(n)




<br>

## 의사코드
```
solution {

1. 대기실은 총 다섯개 돌면서 확인한다.
for : answer[i] = checkroom()? 1 : 0;

}

function  checkroom {

  List 사람loc;

  2. 응시자 위치 파악
  for (j) {
      for (i) {
          if : p인 경우 위치 사람loc에 저장
      }
  }


  3. 응시자 간 거리 검사
  for (i) {
      for (j) {
          p1과  P2의 거리 검삭

          if : distance <= 2 {
              if 같은 행
              if 같은 열
              if 대각선
          }
      }
  }
}


```


<br>

## 구현

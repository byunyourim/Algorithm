https://school.programmers.co.kr/learn/courses/30/lessons/42885

## 재정의
- 구명 보트는 최대 2명 까지만 탈 수 있다.
- limit : 무게 제한
- 구명 보트를 최대한 적게 사용하여 구출하기
- 구명 보트의 개수는?

<br><br>

## 알고리즘
1. people를 오름차순으로 정렬
2. 가장 작은 무게와 가장 큰 무게를 더한다
  - min, max 
  - min + max > limit : max 감소
  - min + max <= limit : min을 하나 증가하고, 튜브 갯수 증가
3. 반복하기


<br><br>

## 의사코드
```
cnt = 0 

people 오름차순 정렬

min = 0 
max = people.length - 1 

while (min <= max) : {
    if (people[min] + people[max] <= limit): {
         min = min + 1 
         max = max - 1          
    }
    answer = answer + 1 
}

return cnt;
```


<br><br>

## 구현

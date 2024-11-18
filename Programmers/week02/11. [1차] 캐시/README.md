링크 : https://school.programmers.co.kr/learn/courses/30/lessons/17680    
  
<img width="691" alt="image" src="https://github.com/user-attachments/assets/62699de4-2c6f-4918-ab5b-d60abaae8224">


## 1. 문제 이해


## 2. 재정의
캐시에 없는 경우 캐시 미스로 메모리에 직접 접근해서 가져와야 한다. 이때 실행 시간은 5가 추가된다.  
캐시에 있는 경우 캐시 힛으로 실행 시간은 1이 추가된다.  
  
키 교체 알고리즘은 LRU로 가장 오랫동안 사용되지 않은 값을 캐시에서 제거한다.  

## 3. 알고리즘
가장 오래된 값을 제거해야 한다.

Deque 

Deque는 양방향 구조로 양쪽으로 삽입, 삭제가 가능하다.
  
시간복잡도 : O(n)  

- 캐시에서 항목을 찾고 제거하는 작업(remove)은 최악의 경우 캐시 크기만큼 시간이 소요된다.


## 4. 수도코드 작성
```
실행시간 = 0;
캐시힛 = 1;
캐시미스 = 5;

캐시 = 리스트 생성
for 도시배열, 도시배열의 길이만큼, 1개씩 증가 {
    city = city.toLowerCase();

    if 캐시리스트에 도시가 존재하면: 
      캐시리스트 맨 뒤에서 제거
      캐시리스트 맨 앞에 추가
      실행시간 += 1

    else 캐시리스트에 도시가 존재하지 않으면: 
      if 캐시리스트가 꽉 차있는 경우:
          캐시리스트 맨 뒤 제거
          캐시리스트 맨 앞 추가
          실행시간 += 5
      else 캐시리스트가 빈 경우:
          캐시리스트 맨 앞 추가
          실행시간 += 5
      
    return 실행시간;
}
```

## 5. 코드구현 
[코드](https://github.com/byunyourim/TIL/blob/main/Programmers/week2/11.%20%5B1%EC%B0%A8%5D%20%EC%BA%90%EC%8B%9C/Solution.java)


## 6. 개선

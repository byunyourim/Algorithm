https://school.programmers.co.kr/learn/courses/30/lessons/42883

## 재정의 
- 어떤 숫자에서 k 개의 수를 제거했을 때 얻을 수 있는 가장 큰 수

 
<br><br>



## 알고리즘
- 중첩 for문을 이용한다면? -> 시간복잡도가 너무 크지 않을까?
- 우선순위가 높은 것을 남기자.
- 작은 값을 제거하자..!


1. for 문 뽑아야 하는 수만큼 반복
2. 구간으로 나누고, 그 구간에서 가장 큰 값을 뽑는다.
5. 뽑아야 하는 수만큼 반복한다. 

#### 시간 복잡도 : O(n * k)
remaining 횟수만큼 반복된다. O(n - k)가 된다.    
이 값은 O(n)이라고 할 수 있다.   

내부 반복문은 j가 idx부터 i + k까지 증가하므로, 반복 횟수는 (i + k - idx)이다.  
하지만 idx가 계속해서 증가하기 때문에 범위가 매번 줄어든다. 최악의 경우, 첫 번째 반복에서는 k번, 두 번째 반복에서는 k-1번 반복한다.  

<br>

#### 공간 복잡도 : O(n)
StringBuilder에서 사용되는 공간
<br><br>


## 의사코드



<br><br>


## 구현



<br><br>

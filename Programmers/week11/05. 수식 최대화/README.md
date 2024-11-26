https://school.programmers.co.kr/learn/courses/30/lessons/67257

## 재정의
- 수식에 포함된 연산자가 2개라면 정의할 수 있는 연산자 우선순위 조합은 2! = 2가지이며
- 연산자가 3개라면 3! = 6가지 조합이 가능.
- 제출한 숫자가 가장 큰 참가자를 우승자로 선정
- 같은 연산자끼리는 앞에 있는 것의 우선순위가 더 높다.

<br><br>

## 알고리즘
0. 가능한 연산의 모든 조합
1. 피연산자와 연산자 각각 분리?
   - [50, 6, 3, 2]
   - [*, -, *]
   - 연산의 피연산자의 위치 (n ~ n+1)
   - 연산자 사용시 해당 위치의 연산자 제거,
2. 연산자의 순서에 따라 계산 
3. 그 중 절대값이 가장 큰 수 


<br><br>

## 시간복잡도
- splitExpression : 문자열expressions의 길이만큼 순회한 후 리스트에 넣는다. O(N)
- evaluate : 우선순위의 개수 6 * 연산자의 개수(대략 N/2) 만큼 순회한다. 6 * O(N)
- O(N) + O(N) = O(N)

## 공간복잡도
- 연산자와 피연산자의 각각 리스트만큼의 공간을 사용한다. O(2N) --> O(N)
- evaluate : nums와 ops는 각각 numbers와 operators를 복사 → O(N)
- 우선순위 배열 등, 크기가 고정된 데이터 구조 → O(1)
- numbers + operators + nums + ops = O(N).
- 
<br><br>

## 의사코드
```
int[][] priotiry = {{}, {}, ...}; 가능한 모든 순열

func solution : {
  연산자 리스트 :[*, -, *]
  피연산자 리스트 :[50, 6, 3, 2]

  long max = 0;
  for (priority p) {  // 모든 우선순위
      max = Math.max(evaluate(숫자리스트, 연산자리스트, p))  // 절대값
  }

  return max;
}

func evaluate (숫자 리스트, 연산자리스트, 우선순위 연산 배열) :  {
    for (p) {
      while (연산자의 수만틈) {
          res = calc()
          리스트 업데이트
      }
    }
    return res;
}

func calc (연산자, 피연산자1, 피연산자2) : {
    연산
    return int;
}


```




<br><br>


## 구현






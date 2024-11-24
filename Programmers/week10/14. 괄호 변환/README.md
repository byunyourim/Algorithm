https://school.programmers.co.kr/learn/courses/30/lessons/60058

<br><br>

## 재정의
- 올바른 괄호 문자열로 변환


<img width="1074" alt="image" src="https://github.com/user-attachments/assets/bda6e1b5-5ff1-4796-938e-9ee968069c71">

<br>

#### 시간 복잡도
- 문자열 p의 길이를 n이라고 할 때:
- solution() : 문자열을 두 부분으로 나누고 각 부분에 대해 재귀적으로 호출.
- 이로 인해 분할 정복 방식으로 호출되며 전체 문자열을 한 번 순회하는 연산이 포함.
- O(n^2) 
#### 공간 복잡도
- 재귀 호출에 따른 스택의 크기
- O(N)
  
<br>
<br>

## 알고리즘
- ( 와 )의 갯수를 비교하자.
- 사용할 수 있는 방법은 갯수를 세는 법과, 스택을 이용하는 방법

1. 빈 문자열인지 확인 return "";
2. u와 v 분리
3. u가 올바른 문자열인지 확인
4. u가 올바르지 않은 경우 새로운 문자열 만든다.
   -   (, )를 붙이고 재귀적으로 결과를 이어 붙인다.

<br>
<br>

## 의사코드
```
1. 비었으면 빈 문자열 반환
    
2. u, v로 분리 
int openCnt = 0;
for ( i ~ p.len) {
    if : p == 'C' 이면 openCnt++;
    else : openCnt--;
    
    u.append(p);
    if (openCnt == 0) v.append(p.substring(i + 1));
    break;
}

if 올바른 문자열인 경우 : return u + solution(v)

if 올바르지 않다면?
  - 새로운 문자열 생성
  - newstring += solution(v);
  - ) 추가
  - 나머지 뒤집기


return newString
```
<br>
<br>

## 구현

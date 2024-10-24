https://school.programmers.co.kr/learn/courses/30/lessons/49993

## 재정의
skill = "CBD"

skill_trees : ["BACDE", "CBADF", "AECB", "BDA"]

스킬의 순서대로 들어가야 한다. 

**B** A **C** **D** E -->> B보다 c가 선행되어야 함 (실패)

**B**  **D** A -->> b의 선행과목인 c가 없음 (실패)

AE **C** **B** 가능  -->> 성공


<br><br>



## 알고리즘

Set에 skill 부여

스킬의 요소 개별로
 B, A, C, D, E 중


1. 없는 문자를 우선 제거
2. 시작값 비교

O(N*M)
- N: 스킬트리 배열의 길이
- M: 각 스킬트리의 길이



<br><br>



## 의사코드
```
answer = 0;

for(String skill_tree : skill_trees) {

    1.
    skill_tree의 원소 하나하나 필터링하여, skill에 없는 값을 제거한다.
    
    2.
    if (skill로 시작하는 경우) answer ++;

}

return answer;
```



## 구현

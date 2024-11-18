https://school.programmers.co.kr/learn/courses/30/lessons/155652


## 재정의
- String s, String skip, int index
- 문자열 s의 각 알파벳을 index 만큼 뒤의 알파벳으로 바꾼다.
- z를 넘어갈 경우 다시 a로 돌아간다.
- skip에 있는 알파벳은 제외하고 넘어간다.


## 알고리즘
1. s문자열의 각각의 문자를 순회한다.
2. s 문자의 인덱스에 + 5를 한다.
   2-1. z보다 큰 경우 a부터 다시 시작한다.
   2-2. skip에 있는 숫자인 경우, skip에 속하는 수 만큼 + n한다.
3. 문자열 또는 배열에 추가한다.



## 의사코드
```
StringBuilder 문자를 추가할 변수 builder;

for(s) {
    Stirng value = s[i] + index;

    if (스킵에 속한 단어가 있는 경우, 범위로 확인하기) {
        속한 단어가 몇 개인지 확인 cnt
        value + cnt;
    }
    if (z를 넘어가는 경우) {
       value + z를 넘어간 수 
    }

    builder.append(value)
}

return builder

```




## 구현





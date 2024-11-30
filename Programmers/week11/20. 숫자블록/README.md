https://school.programmers.co.kr/learn/courses/30/lessons/12923

<br><br>

## 재정의
- 블록에 적힌 번호의 n*2 위치에 해당 블록을 설치한다.
- 기존에 설치된 블록은 빼고 새로운 블록을 넣는다.
- 구간에 깔려있는 블록의 숫자 배열을 구하시오



<br><br>

## 알고리즘
1. 배열 생성 (end - begin + 1)
2. 최대 배열크기의 반까지 숫자를 넣는다.
3. 1부터 반복





<br><br>

## 의사코드
```
arr[0] = 0;
for (i: begin ~ end/2) {
    for (i: 2 ~ end/i ) {
        int loc = i *j;
        if (loc > end) break;

        answer[loc] = (int) i;
    }
}
return Arrays.copyOfRange(answere, begin, end);

```




<br><br>

## 구현
위의 방법은 중첩 반복문을 사용해서, 효율성이 0점이다. 허허

#### 다른 풀이2
각 블록에 대해 가장 큰 약수를 찾아 저장한다. 

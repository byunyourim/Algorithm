https://school.programmers.co.kr/learn/courses/30/lessons/17681

## 재정의
- n : 한 변의 길이
- arr1 : 지도1
- arr2 : 지도2

- 지도1과 지도2를 합친다.
- 둘 중 하나라도 벽이면 그곳은 벽이다. #로 표시
- 둘 다 빈 공간이면 그곳은 빈 공간이다. 공백
- 배열로 반환


## 알고리즘
1. 십진수를 2진수로 변환한다. (9 -> 1001)
2. 변환한 2진수를 5자리로 만든다.
3. or 연산을 수행한다.
4. 1은 #으로 변환하고
5. 문자로 만든뒤
6. 배열에 넣는다.

  
- 시간복잡도는  O (n * n)


## 의사코드
```
for (배열의 크기) {
    10 -> 2진수로 변환
    5자리로 만들어서 새로운 배열에 넣는다.
    newArr1, newArr2
}


for (배열의 크기) {
    StringBuilder builder;
    for (배열 안의 원소 (n)) {
        newArr1, newArr2의 각 원소에 OR 연산을 수행한다.
        if ( 1인 경우) builder.append(#);
        else if(0인 경우) builder.append(공백);
    }
    result[idx] = builder;
}

return String[]
```


## 구현

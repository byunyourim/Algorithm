https://school.programmers.co.kr/learn/courses/30/lessons/77885

## 재정의
- 양의 정수 x에 대한 f(x)  = x보다 크고 x와 비트가 1~2개 다른 수들 중에서 제일 작은 수
- 비트의 다른 부분이 2개 이하이면서 제일 작은 수를 구하라

## 알고리즘
1. 숫자를 이진수로 변경
2. 숫자를 현재 수보다 하나씩 증가
   -> 이진수로 변경
   -> 다른 비트의 개수 확인 : 2개 이하인 경우 배열에 넣는다.


## 의사코드
```
long[] result = numbers의 개수
for (numbers) {
    String numBinary  = number 이진법으로
    int count = 1;
    while (1) {
       
       String newBinary += count;
       
       비트수 비교
       if (비트수 2개 이하면)  {
            배열에 넣고 break;
       }

       count++;

    }
   결과 리턴

}


```


## 구현



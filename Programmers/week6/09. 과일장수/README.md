https://school.programmers.co.kr/learn/courses/30/lessons/135808

## 재정의
1~k 까지 점수로 사과 분류
- 한 상자 = 사과 m개
- 가장 낮은 점수의 사과p
- 가격 : p * m
- 사과 장수가 얻는 최대 이익
- 상자단위로만 판매하고 나머지는 버림
- (최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수)

## 알고리즘
- score 내림차순 정렬
- m개만큼 자르기
- 최소 수 p 구하기
- p * m * 박스 갯수

  

## 의사코드
```
사과 점수 내림차순 정렬
int result = 이익
for (사과의 갯수만큼 돌기) {
    if (index : m의 배수인 경우) {
        result += 사과[index] * m ;
    }
}

return res;

```





## 구현

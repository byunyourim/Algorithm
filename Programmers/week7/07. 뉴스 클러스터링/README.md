## 뉴스 클러스터링
https://school.programmers.co.kr/learn/courses/30/lessons/17677
- 소요시간 :



## 재정의
- str1
- str2
- 자카드 유사도 : 교집합 / 합집합
- 두 글자씩 끊어서 다중 집합을 만들 수 있다.
- 영문자만 유효하다. 그 외는 버린다.
- 대소문자 무시

## 알고리즘
0. 대소문자 무시로 전체 소문자로 변경
1. 문자열을 두 글자씩 끊는다.
2. 문자열 외 기호를 포함하는 값은 다 제거한다.
3. 교집합과 합집합을 구한다.
4. 3을 이용해 자카드 유사도를 구한다.



## 의사코드
```
// 소문자로 변경
for (str1) {
    두글자씩 끊는다.
    기호제거
    newStr1[]
}

for (str2) {
    두글자씩 끊는다.
    기호 제거
    newStr2[]
}

Map<>에 newStr1, newStr2 둘 다 넣기

int 교집합 inter n >= 2
int 합집합 sum

int 자카드 유사도 (jvalue)
int value = jvalue  * 65536 , 소수점 아래 버리기







```

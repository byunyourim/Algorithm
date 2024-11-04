https://school.programmers.co.kr/learn/courses/30/lessons/17686


## 재정의
- 파일에 포함된 숫자를 반영한 정렬 기능 구현
- 파일명은 영문자로 시작하며, 숫자를 하나 이상 포함하고 있다.
- head, number, tail 세 부분으로 구성
- head : 문자 , 최소 한 글자
- number : 한 글자에서 최대 다섯 글자 사이 연속된 숫자, 앞에 0이 올 수 있다.
- tail : 나머지 부분으로 숫자가 다시 나올 수 있고, 아무 글자도 없을 수 있다.
- 정렬 기준 head (대소문자 구분 x), 숫자 순(앞의 0무시),
- head와 number 둘 다 같은 경우 원래 순서 유지




## 알고리즘
1. 문자열을 헤더와 숫자 부분으로 나눈다.
2. 가장 먼저, 문자 비교
3. 같다면 숫자 비교 -> 숫자가 같다면 들어있는 순서 그대로 나오도록
4. 다르다면 문자로 오름차순 정렬
5. 위의 과정 반복
6. 배열로 리턴

- Map<header, number>
- 순서 유지를 위해 map을 리스트에 넣는다.
- 문자로 정렬 후
- 숫자 정렬을 할 때 0 무시하고 정렬

### 시간 복잡도
파일 목록을 순회하면서 extractLeadingNumber를 호출한다. 정규 표현식을 사용하여 숫자를 추출하는데, 파일 이름의 길이(m)에 따라 O(m) 시간이 소요된다.  

Comparator.comparing을 통해 HEAD와 NUMBER를 비교하는데, O(n log n)이다. (n은 파일 개수).
전체 시간 복잡도는 O(n log n) + O(n * m)이다.  

### 공간 복잡도
파일 목록을 저장하기 위해 List<Map<String, Integer>>를 사용하고, 따라서 O(n) 공간이 필요하다. 각 파일 이름에 대해 정수 값을 저장하기 때문에 각 맵의 크기가 작다. 
공간 사용량은 주로 리스트 크기에 의존한다.


## 의사코드
```
List<Map<header, Number>> dataList

for (file) {
    키 : 파일명 원본
    value : 정렬할 숫자
}

// 문자열로 정렬 후 같으면 문자로 정렬
dataList.stream()
      .sort();

 

```



## 구현

https://school.programmers.co.kr/learn/courses/30/lessons/12904
<br><br>

## 재정의
- 펠린드롬 : 앞뒤를 뒤집어도 똑같은 문자열
- 문자열 s가 주어질때, 부분 문자열 중 가장 긴 펠린드롬의 길이 리턴
- 대칭이어야함
- 문제가 짧아서 너무 좋다.






<br><br>

## 알고리즘
- 1. 중심 지정 (중심이 1개인 경우, 2개인 경우)
- 2. 중심을 기준으로 양쪽으로 확대






<br><br>


#### 시간 복잡도
- 외부 for 루프 안에 expandAroundCenter를 호출한다.
- expandAroundCenter 중심을 기준으로 while을 돌며 확장하는 방식, 최악의 경우 O(n)
- O(n^2)



#### 공간 복잡도
- 추가적인 공간없이 변수만 사용
- O(1)



<br><br>

## 의사코드
```
solution : 
maxlen 최대길이
for (0~s.length) {
   1. maxlen = 중심이 1인 경우 팰린드롬의 최대 길이 exapandAroundCeter(x, y, s)
   2. maxlen = 중심이 2인 경우 펠린드롬의 최대 길이

}
return maxlen


expandAroundCeter :
while (x, y가 0 이상이고 문자열 길이 보다 작고 && 좌우의 값이 같아야함) {
  left--;
  right++;
}
return 길이 right - left-1;
```



<br><br>

## 구현

https://school.programmers.co.kr/learn/courses/30/lessons/60057

<br><br>

## 재정의
- 압축해서 가장 짧은 문자열의 길이를 반환하라!


<br><br>

## 알고리즘
1. 문자열을 1부터 n/2 단위로 잘라 압축을 한다. 문자열 길이의 절반을 넘으면 압축할 수 없다.
2. prev는 이전 단위 문자열, current 현재 단위 문자열을 설정한다.
   - 두 문자열이 같으면 count++, 다르면 count, prev를 추가한다.
3. 반복문 종료 후 남은 단위 문자열 처리
4. 각 단위 길이별로 압축된 문자열의 길이를 계산해 최소값을 갱신

#### 시간복잡도
- 1~n/2까지 탐색한다. O(n/2)
- 문자열을 단위 크기만큼 잘라서 비교한다. O(n)
- O(n^2)
#### 공간복잡도
- 압축 결과를 저장하는 stringbuildre O(n)
- prev, currenet와 같은 문자열 변수와 정수 변수 등의 추가 공간 O(1)
- O(n)

<br><br>

## 의사코드
```
for (문자열 길이 압축 시도 1 ~ n/2, unit) {
   prev = 첫 번째 단위 문자열
   count = 1;

   for (단위크기 만큼 문자열 탐색 unit ~ s.length, i += unit) {
      current = (i + unit > s.length) ? s.substring(i) : s.substring(i, i + unit);

      if (이전 단위와 동일하면) count++;
      else {
        if (count > 1) builder.append(count);

        builder.append(count);
        prev = current;
        count = 1;
      }
   }
   minlen = 압축결과 비교
}
return minlen;
```


<br><br>

## 구현

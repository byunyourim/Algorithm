https://school.programmers.co.kr/learn/courses/30/lessons/140108


## 재정의
1. 가장 첫 글자는 x이다.
2. x의 갯수와 x가 아닌 것의 갯수를 센다.
3. 두 카운트가 같아지는 순간 분리
4. 남은 부분에 대해 반복하여 분리된 문자열의 갯수를 구한다.

x가 1개이면, x가 아닌 수도 1개가 나온 후 자른다.
-> cnt++;



## 알고리즘
가장 첫글자의 반복횟수와 첫 글자와 다른 글자의 횟수가 일치하는 부분에서 문자열을 잘라야 한다.
1. 배열의 첫 글자부터 탐색을 한다.
2. 첫 글자를 x로 설정
3. 다음 글자가 x인 경우
   - x의 갯수 카운트
4. 다음 글자가 x가 아닌 경우
   - x의 갯수와, x가 아닌 것의 갯수가동일할 때 문자열 분리
5. 위의 과정 반복





## 의사코드
```
int answer = 0;
int index = 0;
while (index < s.length) {
    char x = s.charAt(index);
    int xCount = 0;
    int otherCount = 0;

    while (index < s.length()) {
        if (s.charAt(index) == x) {
            xCount ++;
        } else {
            otherCount++;
        }
        index++;

        if (xCount == otherCount) {
            answer++;
            break;
        }
    }

    
   if (index == s.length() && xCount != otherCount) {
        answer++;
    }
    
}

return answer;
```




## 구현

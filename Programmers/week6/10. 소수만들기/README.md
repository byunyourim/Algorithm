https://school.programmers.co.kr/learn/courses/30/lessons/12977
## 재정의
nums배열에 있는 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 수를 구한다.  



## 알고리즘
1. 더해서 나오는 모든 숫자를 구한다. (중첩for문)
2. 그 숫자들 중 소수를 구한다.

#### 소수를 구하는 방법
- 1과 자신 만을 갖는 수
- 0 ~ 루트 n보다 작은 수로 나눴을 때, 나누어 떨어지지 않아야 한다.

## 의사코드
```
Set<Integer> sumList = new Hash<Integer>();
for (int i = 0; i < nums.length-2; i++) {
    for (int j = i + 1; j < nums.length-1; i++) {
        for (int k = j + 1; k < nums.length; k++) {
           if 소수이면 : cnt ++ 
        }
    }
}
return cnt;
```

//소수인지 판별하는 메서드 추가
- n이 1인 경우 return false
- 2~루트n까지 나누어 떨어지지 않으면 트루

## 구현

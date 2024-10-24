## 재정의
- sequence = [1, 2, 3, 4, 5]	
- sum = 7	
- index = [2, 3]

연속된 수의 값이 sum이 될때 인덱스를 구하기!!  
여러개인 경우 가장 앞에 것으로!!!

## 알고리즘
투포인터 이용
- start, end를 가지고 범위 값 구하기
- O(N)




## 의사코드
```
start = 0, end = 0
current = 0
minlen = 0
int res = new int[2];

while (end 가 squence길이보다 작은 동안) {
    if : currnt  == k {
        인덱스 범위 확인 후, 제일 작은 경우 result에 값 넣는다.
    }
    if : currnt  < k {
        end ++
        if (end < seq.len) {
           현재값 + seq[end]
        }
    }
    if : currnt  > k {
        현재값 - seq[start]
        start++
    }
}
```




## 구현

https://school.programmers.co.kr/learn/courses/30/lessons/92334#


## 재정의
- 각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
- 신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
- 한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
- k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송한다.
- 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.

- 각 유저가 신고 메일을 받는 횟수를 배열로 표시해라!!



## 알고리즘
- id_list : 유저 목록이다.
- report : 각 유저가 신고한 ID이다.
- k : k 이상인 경우 정지된다.

1. 유저를 순회한다.
2. 신고한 아이디를 리스트로 저장한다. ("유저", 리스트)
3. 유저와,신고 횟수를 맵으로 카운트한다.
4. 그 중 신고 횟수가 >= k 인 정지 리스트로 정리한다.


6. 유저 카운트를 돈다.
7. 정지목록의 회원이 있는 경우 카운트를 증가한다.
8. 배열에 넣는다.
9. 그 배열을 반환한다.


  


## 의사코드
```
Set<String> blackList;
Map<String, Set<String>> userMap
Map<String, Integer> BlackCntMap;
List<String> sendEamilIds;
for (id_list) {
    
    for (report[idx]) {
        blackList.add (report);
        BlackCntMap.put("유저ID", cnt);
        if (cnt >= k) sendEamilIds 에 넣기

    }

    userMap.put("id", blacklist);    
}

for (sendEamilIds) {
    usermap 에 리스트에 있다면 cnt++;

}
return cnt;

```



## 구현

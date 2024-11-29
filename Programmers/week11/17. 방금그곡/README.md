https://school.programmers.co.kr/learn/courses/30/lessons/17683


## 재정의
- 각 음은 1분에 1개씩 재생, 반복 재생가능
- 00:00을 넘겨서까지 재생되는 일은 없다.
- 조건이 일치하는 음악이 여러 개인 경우 재생된 시간이 제일 긴 음악 반환
- 재싱된 시간 같은 경우 먼저 입력된 음악 제목 반환
- 조건에 일치하는 음악이 없는 경우 None반환

<br><br>

## 알고리즘
- 재생 순서로 정렬
- 재생시간 확인, 음의 길이로 노래 길이 확인, 길이만큼 문자ㅏ열(str) 만들기
- m이 str에 포함되는지 확인
- 조건에 일치하지 않는 경우 return none;

<br>

#### 시간복잡도
#### 공간복잡도

<br><br>

## 의사코드
```
musicinfos[0]으로 정렬 할 필요 있나?

Map<String, Music> musicMap = 노래 이름, 노래 정보(재생시간, 음)

Set<Music> musicSet
for (entry : musicMap) {

  if (m이 포함되면) musicSet에 추가
  if 조건에 일치하는 음악이 여러 개면? 재생된 시간이 제일 긴 음악 반환,
  if 시간도 같으면 먼저 입력된 음악제목 반환 

}
return "NONE";



class Music {
  name
  startTime
  endTime
  playTime
  songLength;
}
```



<br><br>

## 구현






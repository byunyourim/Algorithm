https://school.programmers.co.kr/learn/courses/30/lessons/17683


## 재정의
- 각 음은 1분에 1개씩 재생, 반복 재생가능
- 00:00을 넘겨서까지 재생되는 일은 없다.
- 조건이 일치하는 음악이 여러 개인 경우 재생된 시간이 제일 긴 음악 반환
- 재싱된 시간 같은 경우 먼저 입력된 음악 제목 반환
- 조건에 일치하는 음악이 없는 경우 None반환

<br><br>

## 알고리즘
1. 음악 코드 변경 (샵 처리)
2. musicinfo 파싱
3. 악보가 재생 시간만큼 반복되도록
4. mkey가 music과 일치하는지 확인
   

<br><br>

## 의사코드
```

Map<String, Music> musicMap = 노래 이름, 노래 정보(재생시간, 음)

Set<Music> musicSet
for (entry : musicMap) {
  music 파싱

  음악 재생시간에 맞게 전체 음악 반환 generateFullMusic();

  if 음악이 일치하는지 확인
     answer = title;

}
return answer;



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






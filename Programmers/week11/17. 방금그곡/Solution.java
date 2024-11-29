// 채점 결과
// 정확성: 91.4
// 합계: 91.4 / 100.0
import java.util.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        // '#'이 포함된 음을 일치시키기 위해, '#'을 다른 문자로 치환
        m = convertNotes(m);

        List<Music> musicList = new ArrayList<>();
        for (String musicinfo : musicinfos) {
            String[] str = musicinfo.split(",");
            int ptime = calcTime(str[0], str[1]);
            String musicname = str[2];
            String fullNotes = buildMusic(convertNotes(str[3]), ptime);

            // 멜로디(m)가 재생된 음(fullNotes)에 포함되는지 확인
            if (fullNotes.contains(m)) {
                musicList.add(new Music(musicname, ptime, str[0]));
            }
        }

        // 조건에 따라 가장 적합한 곡을 선택
        return musicList.stream()
                .max(Comparator.comparingInt(Music::getPtime) // 1. 재생 시간 우선
                        .thenComparing(Music::getStime)) // 2. 먼저 입력된 곡 우선
                .map(Music::getName) // 곡 이름 반환
                .orElse("(None)"); // 조건에 맞는 곡이 없을 경우
    }

    // 재생 시간을 계산하는 메서드
    private int calcTime(String start, String end) {
        int sHour = Integer.parseInt(start.split(":")[0]);
        int sMinute = Integer.parseInt(start.split(":")[1]);
        int eHour = Integer.parseInt(end.split(":")[0]);
        int eMinute = Integer.parseInt(end.split(":")[1]);
        return (eHour * 60 + eMinute) - (sHour * 60 + sMinute);
    }

    // 주어진 멜로디를 재생 시간에 맞게 반복하여 생성
    private String buildMusic(String notes, int ptime) {
        StringBuilder builder = new StringBuilder();
        int len = notes.length();
        for (int i = 0; i < ptime; i++) {
            builder.append(notes.charAt(i % len));
        }
        return builder.toString();
    }

    // '#'이 포함된 음을 변환
    private String convertNotes(String notes) {
        return notes.replace("C#", "c")
                .replace("D#", "d")
                .replace("F#", "f")
                .replace("G#", "g")
                .replace("A#", "a");
    }
}

class Music {
    private String name; // 곡 이름
    private String stime; // 시작 시간
    private int ptime; // 재생 시간

    public Music(String name, int ptime, String stime) {
        this.name = name;
        this.ptime = ptime;
        this.stime = stime;
    }

    public String getName() {
        return name;
    }

    public String getStime() {
        return stime;
    }

    public int getPtime() {
        return ptime;
    }
}

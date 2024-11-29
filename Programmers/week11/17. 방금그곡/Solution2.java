import java.util.*;

public class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int maxPlayTime = 0;

        String mKey = convert(m);

        for (String musicInfo : musicinfos) {
            String[] parts = musicInfo.split(",");
            String title = parts[2];   // 곡 제목
            int startTime = Integer.parseInt(parts[0].substring(0, 2)) * 60 + Integer.parseInt(parts[0].substring(3, 5));
            int endTime = Integer.parseInt(parts[1].substring(0, 2)) * 60 + Integer.parseInt(parts[1].substring(3, 5));
            int playTime = endTime - startTime; // 곡의 재생 시간

            String music = convert(parts[3]);
            String fullMusic = generateFullMusic(music, playTime);

            if (fullMusic.contains(mKey) && playTime > maxPlayTime) {
                maxPlayTime = playTime;
                answer = title;
            }
        }

        return answer;
    }

    private String convert(String music) {
        return music.replace("C#", "H")
                    .replace("D#", "I")
                    .replace("F#", "J")
                    .replace("G#", "K")
                    .replace("A#", "L")
                    .replace("B#", "M");
    }

    private String generateFullMusic(String music, int playTime) {
        StringBuilder sb = new StringBuilder();
        int repeatCount = playTime / music.length();
        int remainder = playTime % music.length();

        for (int i = 0; i < repeatCount; i++) {
            sb.append(music);
        }

        sb.append(music.substring(0, remainder));

        return sb.toString();
    }
}

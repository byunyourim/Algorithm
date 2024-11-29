import java.util.*;

public class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        // 셔틀버스 시간이 담긴 리스트
        List<Integer> busTimes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            busTimes.add(9 * 60 + i * t);  // 첫 번째 버스는 9:00, 그 이후로 t 간격
        }

        // 승객의 도착 시간을 분 단위로 변환하고 정렬
        List<Integer> passengers = new ArrayList<>();
        for (String time : timetable) {
            String[] split = time.split(":");
            int minutes = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
            passengers.add(minutes);
        }
        Collections.sort(passengers);

        // 각 버스에 탑승할 수 있는 승객 배정
        int passengerIndex = 0;
        for (int i = 0; i < n; i++) {
            int busTime = busTimes.get(i);
            int count = 0;

            // 해당 버스가 출발할 수 있을 때까지 탑승 가능한 승객을 탑승
            while (passengerIndex < passengers.size() && passengers.get(passengerIndex) <= busTime && count < m) {
                passengerIndex++;
                count++;
            }

            // 마지막 버스에서 탈 승객이 있다면, 그 시간보다 1분 빠른 시간으로 설정
            if (i == n - 1) {
                if (count < m) {
                    return String.format("%02d:%02d", busTime / 60, busTime % 60);
                } else {
                    return String.format("%02d:%02d", (passengers.get(passengerIndex - 1) - 1) / 60, (passengers.get(passengerIndex - 1) - 1) % 60);
                }
            }
        }

        return "";
    }
}

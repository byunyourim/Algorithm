import java.time.LocalTime;
import java.util.*;
class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        Arrays.sort(timetable);
        
        int stime = 540;
        int mytime = 540  + (t * n); // 마지막 버스의 시간
        
        Queue<Integer> q = new LinkedList<>();
        for (String s : timetable) {
            q.add(convertTimeInt(s));
        };
        
        int memberindex = 0;
        
        for (int i = 0; i < n; i++) {
            stime += (i * t);
            mytime = stime;
            
            int emptyseat = m;
            int first = q.peek();
            while (!q.isEmpty()) {  // 사람이 비어있지 않으면 
                int wait = q.peek();    // 시간
                if (stime > wait) { 
                    if (emptyseat > 0) { // 좌석이 비었으면 q에서 제거
                        q.poll();
                        emptyseat--;
                    }
                } else if (stime == wait) {
                    if (emptyseat > 0) {    // 좌석이 비었으면 q에서 제거
                        q.poll();
                        emptyseat--;
                    }
                } else if (stime < wait) {  // 다음 버스로 이동
                    break;
                }
            }
            System.out.println(emptyseat);
            if ((i == n-1) && emptyseat == 0) { // 버스가 만석이고, 막차인 경우
                mytime = first - 1;
            }
        }
        
        return convertTimeString(mytime);
    }
    
    private String convertTimeString(int mytime) {
        StringBuilder builder = new StringBuilder();
        int remainhour = mytime / 60;
        int remainminute = mytime % 60;
        
        return String.format("%02d", remainhour)  + 
            ":" + String.format("%02d", remainminute);
    }
    
    private Integer convertTimeInt(String t) {
        String[] s = t.split(":");
        int hour = Integer.parseInt(s[0]);
        int minute = Integer.parseInt(s[1]);
        
    
        return hour * 60 + minute;
        
    }
}

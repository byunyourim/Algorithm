import java.util.*;

public class Solution {
    public int solution(String[][] book_time) {
        List<int[]> bookings = new ArrayList<>();
        for (String[] time : book_time) {
            int start = convertToMinutes(time[0]);
            int end = convertToMinutes(time[1]) + 10; 
            
            bookings.add(new int[]{start, end});
        }
        bookings.sort(Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> roomEndTimes = new PriorityQueue<>();
        for (int[] booking : bookings) {
            int start = booking[0];
            int end = booking[1];

            if (!roomEndTimes.isEmpty() && roomEndTimes.peek() <= start) {
                roomEndTimes.poll();
            }
            roomEndTimes.add(end);
        }

        return roomEndTimes.size();
    }

    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}

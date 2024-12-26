import java.util.*;

class Solution {
    List<List<Point>> shortRouteList = new ArrayList<>();
    Map<Integer, Point> pointMap = new HashMap<>();
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        
        setPointMap(points);
        
        // 1. 최단 거리 경로 추적하기
        int maxRouteDist = 0;
        for (int[] r : routes) {
            List<Point> route = getShortestRoute(r);
            shortRouteList.add(route);
            maxRouteDist = Math.max(maxRouteDist, route.size());
        }
        
        int count = findConfilctCnt(shortRouteList, maxRouteDist);
        
        return count;
    }
    
    private void setPointMap(int[][] p) {
        for (int i = 0; i < p.length; i++) {
            pointMap.put(i + 1, new Point(p[i][0], p[i][1]));
        }
    }
    
    private List<Point> getShortestRoute(int[] route) {
        List<Point> shortestRoute = new ArrayList<>();
        for (int i = 1; i < route.length; i++) {
            Point start = pointMap.get(route[i-1]);    // 출발점
            Point end = pointMap.get(route[i]);    // 도착점
            int r = start.r;
            int c = start.c;
            
            if (shortestRoute.isEmpty()) {
                shortestRoute.add(new Point(r, c));
            }
            
            while (r != end.r) {
                r += (r > end.r) ? -1 : 1;
                shortestRoute.add(new Point(r, c));
            }

            while (c != end.c) {
                c += (c > end.c) ? -1 : 1;
                shortestRoute.add(new Point(r, c));
            }
        }
        
        return shortestRoute;
    } 
    
    private int findConfilctCnt(List<List<Point>> points, int dist) {
        int count = 0; 
        
        for (int i = 0; i < dist; i++) {
            Map<Point, Integer> countMap = new HashMap<>();
            for (List<Point> p : points) {
                Point point = (p.size() > i) ? p.get(i) : null;
                
                if (point == null) continue;
                
                countMap.put(point, countMap.getOrDefault(point, 0)+ 1); 
            }
            
            for (int c : countMap.values()) {
                if (c > 1) {
                    count++;
                }
            }
        }
        return count;
    }
}


class Point {
    int r;
    int c;
    
    public Point(int r, int c) {
        this.r = r;
        this.c = c;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return r == point.r && c == point.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, c);
    }
}

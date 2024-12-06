import java.util.*;

class Solution {
    static Set<long[]> starSet = new HashSet<>();
    static long minx= Long.MAX_VALUE;
    static long miny= Long.MAX_VALUE;
    static long maxx= Long.MIN_VALUE;
    static long maxy= Long.MIN_VALUE;
    public String[] solution(int[][] line) {
        
        for (int i = 0; i < line.length - 1; i++) {
            long a1 = line[i][0];
            long b1 = line[i][1];
            long c1 = line[i][2];
            
            for (int j = i + 1; j < line.length; j++) {
                long a2 = line[j][0];
                long b2 = line[j][1];
                long c2 = line[j][2];
                
                long parallel = a1 * b2 - a2 * b1;
                if (parallel != 0) {
                    long x = (b1 * c2 - b2 * c1);
                    long y = (a2 * c1 - a1 * c2);
                    
                    if ((x % parallel) != 0 || (y % parallel) != 0) continue;
                    
                    x /= parallel;
                    y /= parallel;

                    starSet.add(new long[]{x, y});
                    minx= Math.min(minx, x);
                    miny= Math.min(miny, y);
                    maxx= Math.max(maxx, x);
                    maxy= Math.max(maxy, y);
                }
            }
        }
        return drawStar();
    }

    private String[] drawStar() {
        long height= maxy-miny+1;
        long width= maxx-minx+1;
        
        String[] answer= new String[(int)height];
        
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<width; i++){
            sb.append(".");
        }
        
        Arrays.fill(answer, sb.toString());
        
        long nx, ny;
        for(long[] loc : starSet){
            ny= maxy-loc[1];
            nx= loc[0]-minx;
            answer[(int)ny]= answer[(int)ny].substring(0, (int)nx)+"*"
                        +answer[(int)ny].substring((int)nx+1);
        }
        
        return answer;
    }
}

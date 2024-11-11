import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        Arrays.sort(costs, (a, b) -> Integer.compare(a[2], b[2]));
        
        int[] parent = new int[n];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        
        int minCost = 0;
        int edgesUsed = 0;
        
        for (int[] edge : costs) {
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];
            
            if (find(parent, u) != find(parent, v)) {
                union(parent, rank, u, v);
                minCost += cost;
                edgesUsed++;
                
                if (edgesUsed == n-1) {
                    break;
                }
            }
        }        
       
        return minCost;
        
    }
    
    public static int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }
    
    public static void union(int[] parent, int[] rank, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX] ++;
            }
        }
    }
}

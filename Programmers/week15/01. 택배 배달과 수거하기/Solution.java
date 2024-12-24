import java.util.*;

class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long totalDistance = 0;
        int deliveryIndex = n - 1;
        int pickupIndex = n - 1;
        
        while(deliveryIndex >= 0 || pickupIndex >= 0) {
            while (deliveryIndex >= 0 
                  && deliveries[deliveryIndex] == 0) {
                deliveryIndex--;
            }
            while (pickupIndex >= 0 && pickups[pickupIndex] == 0) {
                pickupIndex--;
            }
            
            int farthest = Math.max(deliveryIndex, pickupIndex);
            if (farthest < 0) break;
            
            totalDistance += (farthest + 1) * 2;
            
            int currentCap = cap;
            
            for (int i = deliveryIndex; i >= 0 && currentCap > 0; i--) {
                if (deliveries[i] > 0) {
                    int deliverAmount = Math.min(currentCap, deliveries[i]);
                    deliveries[i] -= deliverAmount;
                    currentCap -= deliverAmount;
                }
                if (deliveries[i] == 0) deliveryIndex--;
            }
            
            currentCap = cap;
            for (int i = pickupIndex; i >= 0 && currentCap > 0; i--) {
                if (pickups[i] > 0) {
                    int pickupAmount = Math.min(currentCap, pickups[i]);
                    pickups[i] -= pickupAmount;
                    currentCap -= pickupAmount;
                }
                if (pickups[i] == 0) pickupIndex--;
            }
        }
        
        return totalDistance;
    }
}


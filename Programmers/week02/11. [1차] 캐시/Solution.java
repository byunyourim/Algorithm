class Solution {
    public int solution(int cacheSize, String[] cities) {
        int time = 0;
        int CACHE_HIT = 1;
        int CACHE_MISS = 5;
      
        if (cacheSize == 0) {
            return CACHE_MISS * cities.length;
        }

        Deque<String> cache = new LinkedList<>();
        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.remove(city)) {
                time += CACHE_HIT;
            } else {
                if (cache.size() == cacheSize) {
                    cache.removeLast();
                }
                time += CACHE_MISS;
            }
            cache.addFirst(city);
        }
        return time;
    }
}

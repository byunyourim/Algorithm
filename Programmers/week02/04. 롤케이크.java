// https://school.programmers.co.kr/learn/courses/30/lessons/132265
class Solution_롤케이크자르기 {
    public int solution(int[] toppings) {
        int cnt = 0;
    
        Set<Integer> piece1 = new HashSet<>();
        Map<Integer, Integer> piece2 = new HashMap<>();
    
        for (int i : toppings) {
            piece2.put(i, piece2.getOrDefault(i, 0) + 1);
        }
    
        for (int i=0; i<toppings.length; i++) {
            int currentTopping = toppings[i];
    
            piece1.add(currentTopping);
            piece2.put(currentTopping, piece2.get(currentTopping) - 1);
    
            if (piece2.get(currentTopping) == 0) {
                piece2.remove(currentTopping);
            }
    
            if (piece1.size() == piece2.size()) {
                cnt++;
            }
        }
        return cnt;
    }
}

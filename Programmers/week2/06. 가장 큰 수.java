// https://school.programmers.co.kr/learn/courses/30/lessons/42746
class Solution_가장큰수 {
    public String solution(int[] numbers) {

        String[] strNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((a, b) -> {
                    return (b + a).compareTo(a + b);
                }).toArray(String[]::new);

        if (strNumbers[0].equals("0"))
            return "0";

        return String.join("", strNumbers);
    }
}

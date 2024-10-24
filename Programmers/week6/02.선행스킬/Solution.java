class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skill_tree : skill_trees) {
            String filterSkill = skill_tree.chars()
                .mapToObj(c -> String.valueOf((char)c))
                .filter(s -> skill.contains(s))
                .reduce("",String::concat);

            if (skill.startsWith(filterSkill)) {
                answer++;
            }
        }
        return answer;
    }
}

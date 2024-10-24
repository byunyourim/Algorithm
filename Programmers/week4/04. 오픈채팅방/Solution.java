
class Solution {

    public String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>();
        List<Comment> dataMap = new ArrayList<>();

        List<String> resultList = new ArrayList<>();
        for (String message : record) {
            String[] parts = message.split(" ");
            String action = parts[0];
            String id = parts[1];

            if (!action.equals("Leave")) {
                String nickname = parts[2];
                userMap.put(id, nickname);
            }

            if (!action.equals("Change")) {
                Comment comment = new Comment(action, id);
                dataMap.add(comment);
            }
        }


        for (Comment comment : dataMap) {
            String message = "";
            String nickname = userMap.get(comment.id);
            if (comment.active.equals("Enter")) {
                message = nickname + "님이 들어왔습니다.";
            }
            if (comment.active.equals("Leave")) {
                message = nickname + "님이 나갔습니다.";
            }

            resultList.add(message);
        }
        return resultList.stream().toArray(String[]::new);
    }

}

class Comment {
    String active;
    String id;

    Comment(String active, String id) {
        this.active = active;
        this.id = id;
    }
}

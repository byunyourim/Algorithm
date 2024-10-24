class Solution {
    public String[] solution(String[][] plans) {

        Arrays.sort(plans, (a, b) -> convertToTime(a[1]) - convertToTime(b[1]));
        List<Works> works = new ArrayList<>();

        for (String[] plan : plans) {
            works.add(new Works(plan[0], convertToTime(plan[1]), Integer.parseInt(plan[2])));
        }

        List<String> completed = new ArrayList<>();
        Stack<Works> remainWork = new Stack<>();

        int index = 0;
        int current = 0;
        while (index < works.size()) {
            Works work = works.get(index);
            int currentTime = work.startTime;

            // 다음 작업이 있을 때
            if (index + 1 < works.size()) {
                Works nextWork = works.get(index + 1);

                // 다음 작업 시작 전에 현재 작업을 끝낼 수 있는 경우
                if (currentTime + work.needs <= nextWork.startTime) {
                    completed.add(work.name);
                    currentTime += work.needs;
                    index++;

                    // 중단된 작업이 있는 경우 다시 시작
                    while (!remainWork.isEmpty() && currentTime < nextWork.startTime) {
                        Works remain = remainWork.pop();
                        int timeAvailable = nextWork.startTime - currentTime;

                        if (remain.needs <= timeAvailable) {
                            completed.add(remain.name);
                            currentTime += remain.needs;
                        } else {
                            remainWork.push(new Works(remain.name, remain.needs - timeAvailable));
                            break;
                        }
                    }
                } else {
                    // 현재 작업이 끝나지 않고, 중단해야 하는 경우
                    int remainTime = (currentTime + work.needs) - nextWork.startTime;
                    remainWork.push(new Works(work.name, remainTime));
                    index++; // 다음 작업으로 넘어감
                }
            } else {
                // 마지막 작업은 그냥 처리
                completed.add(work.name);
                index++;
            }
        }
        while (!remainWork.isEmpty()) {
            completed.add(remainWork.pop().name);
        }

        return completed.toArray(new String[0]);
    }

    public int convertToTime(String t) {
        String[] timeStr = t.split(":");
        return Integer.parseInt(timeStr[0]) * 60 + Integer.parseInt(timeStr[1]);
    }

    private class Works {
        String name;
        int startTime;
        int needs;
        int endTime;

        public Works(String name, int startTime, int needs) {
            this.name = name;
            this.startTime = startTime;
            this.needs = needs;
            this.endTime = startTime + needs;
        }


        public Works(String name,int needs) {
            this.name = name;
            this.needs = needs;
        }

    }
}

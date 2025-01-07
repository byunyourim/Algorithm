package algorithm;

import java.util.*;

/**
 * 1 단계
 * 369 게임 구현
 *
 * 2 단계
 * - 오답률 계산 및 게임 종료
 * - 사용자 입력을 받아 동작
 * - 클래스 구조화
 *
 * 3 단계
 * - 지역별 다른 규칙의 게임을 위해 추상화 및 다형성 적용
 * - 서울 지역 3, 6, 9에 박수치기
 * - 부산 지역 2, 4, 6에 박수치기
 * - 예외 처리 ? 값이 아닌
 *
 * 4 단계
 * - 다양한 지역 동시 게임 진행을 위한 동시성 적용
 */
public class Game369 {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Amy", 0.1));
        players.add(new Player("Benny", 0.3));

        Game game = new Game(players, new SeoulGame());
        game.play();

        System.out.println("=====================");

        Game game2 = new Game(players, new BusanGame());
        game2.play();
    }
}

abstract class GameRule {
    protected abstract Set<Character> getTargetNumber();
    protected abstract String getActionSymbol();

    boolean takeAction(int n) {
        String s = String.valueOf(n);
        return s.chars()
            .anyMatch(c -> getTargetNumber().contains((char) c));
    }

    String playAction(int n) {
        String s = String.valueOf(n);
        int count = (int) s.chars()
            .filter(c -> getTargetNumber().contains((char) c))  // 그냥 c는 어떤 값인지?
            .count();

        return getActionSymbol().repeat(count);
    }
}

class SeoulGame extends GameRule {
    @Override
    protected Set<Character> getTargetNumber() {
        return Set.of('3', '6', '9');
    }

    @Override
    protected String getActionSymbol() {
        return "짝";
    }
}

class BusanGame extends GameRule {
    @Override
    protected Set<Character> getTargetNumber() {
        return Set.of('2', '4', '6');
    }

    @Override
    protected String getActionSymbol() {
        return "쿵";
    }
}

class Game {
    List<Player> players;
    int currentNumber;
    GameRule rule;

    Game(List<Player> players, GameRule rule) throws Exception {
        if (players == null || players.isEmpty()) {
            throw new IllegalArgumentException("players cannot be null");
        }
        if (rule == null) {
            throw new IllegalArgumentException("rule cannot be null");
        }

        this.players = players;
        this.currentNumber = 1;
        this.rule = rule;
    }

    public void play() {
        try {
            while (true) {
                for (Player p : players) {
                    String res = p.takeTurn(currentNumber, rule);

                    if (res.equals("오답")) {
                        System.out.println(p.getName() + " 오답: 게임 종료!");
                        return;
                    }
                    System.out.println(p.getName() + " 응답 : " + res);
                    currentNumber++;
                }
            }
        } catch (Exception e) {
            System.err.println("An unexpected error occurred during the game: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

class Player {
    String name;
    double errorRate;
    Random random;

    Player(String name, double errorRate) {
        if (errorRate < 0.0 || errorRate >= 1.0) {
            throw new IllegalArgumentException("Error rate must be between 0.0 and 1.0");
        }

        this.name = name;
        this.errorRate = errorRate;
        this.random = new Random();
    }

    public String getName() {
        return name;
    }

    public String takeTurn(int number, GameRule rule) {
        if (random.nextDouble() < errorRate) {
            return failAction();
        }
        return rule.takeAction(number) ? rule.playAction(number) : String.valueOf(number);
    }

    public String failAction() {
        return "오답";
    }
}


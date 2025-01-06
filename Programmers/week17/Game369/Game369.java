package algorithm;

import java.util.*;
import java.io.*;

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
 *
 * 4 단계
 * - 다양한 지역 동시 게임 진행을 위한 동시성 적용
 */
public class Game369 {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("A", 1));
        players.add(new Player("B", 3));
        players.add(new Player("C", 5));

        Game game = new Game(players);

        game.play();
    }


}


class Game {
    List<Player> players;

    Game(List<Player> players) {
        this.players = players;
    }

    public void play1(int i) {
        String s = String.valueOf(i);
        long count = s.chars()
            .filter(c -> c == '3' || c == '6' || c == '9')
            .count();

        String res = count > 0 ? "짝".repeat( (int) count ) : s;
    }

    public void play() {
        while (true) {
            for (Player p : players) {
                

            }
        }
    }
}

class Player {
    String name;
    double errorRate;

    Player(String name, double errorRate) {
        this.name = name;
        this.errorRate = errorRate;
    }

    public boolean correctAnswer() {

        return false;
    }
}

class ClapCounter {


}

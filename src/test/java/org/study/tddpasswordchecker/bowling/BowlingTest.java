package org.study.tddpasswordchecker.bowling;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.Socket;

/**
 * 볼링 게임
 * 백명석 유튜브 참고
 * https://www.youtube.com/watch?v=fFwDMzML7hI
 * */
public class BowlingTest {

    @Test
    void canCreateGame() throws Exception {
        Game game = new Game();
    }
    @DisplayName("roll() 테스트")
    @Test
    void canRoll() throws Exception {
        Game game = new Game();
        game.roll(0);
    }
}

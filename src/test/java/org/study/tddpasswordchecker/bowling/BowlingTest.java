package org.study.tddpasswordchecker.bowling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.Socket;

import static org.assertj.core.api.Assertions.*;

/**
 * 볼링 게임
 * 백명석 유튜브 참고
 * https://www.youtube.com/watch?v=fFwDMzML7hI
 * */
public class BowlingTest {

    private Game game;

    @BeforeEach
    public void setUp() throws Exception {
        game = new Game();
    }

    @DisplayName("roll() 테스트")
    @Test
    void canRoll() throws Exception {
        game.roll(0);
    }

    @DisplayName("gutterGame")
    @Test
    void gutterGame() throws Exception {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
            assertThat(game.getScore()).isEqualTo(0);
        }
    }
}

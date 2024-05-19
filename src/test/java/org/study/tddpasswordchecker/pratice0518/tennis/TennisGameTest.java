package org.study.tddpasswordchecker.pratice0518.tennis;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisGameTest {

    @Test
    void testNewGameShouldReturnLoveAll() throws Exception {
        TennisGame game = new TennisGame("Iga Swiatek", "Aryna Sabalenka");
        String score = game.getScore();
        assertThat(score).isEqualTo("Love all");
    }
}

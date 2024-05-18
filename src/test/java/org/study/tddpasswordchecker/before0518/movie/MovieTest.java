package org.study.tddpasswordchecker.before0518.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 켄트 벡 - 테스트 주도 개발 - 예제 1. 영화 average 구하기
 * 백명석 유튜브 참고
 * https://www.youtube.com/watch?v=wmHV6L0e1sU&t=1552s
 */
public class MovieTest {

    private Movie movie;

    @BeforeEach
    public void setUp() {
        movie = new Movie();
    }

    @DisplayName("Movie 생성 직 후 average 는 0 ")
    @Test
    void should_return_o_when_just_created() throws Exception {
        assertThat(movie.average()).isEqualTo(0);
    }

    @DisplayName("점수 1을 주고 평점을 구하면 1")
    @Test
    void should_return_1_when_was_rated() throws Exception {
        movie.rate(1);
        assertThat(movie.average()).isEqualTo(1);
    }

    @DisplayName("점수 3과 5를 주고 평점을 구하면 4")
    @Test
    void should_return_4_when_3_and_5_rated() throws Exception {
        movie.rate(3);
        movie.rate(5);
        assertThat(movie.average()).isEqualTo(4);
    }
}

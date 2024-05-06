package org.study.tddpasswordchecker.movie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 켄트 벡 - 테스트 주도 개발 - 예제 1. 영화 average 구하기
 * 백명석 유튜브 참고
 * https://www.youtube.com/watch?v=wmHV6L0e1sU&t=1552s
 */
public class MovieTest {

    @Test
    void canCreateMovie() throws Exception {
        Movie movie = new Movie();
    }

    @DisplayName("Movie 생성 직 후 average 는 0 ")
    @Test
    void should_return_o_when_just_created() throws Exception {
        Movie movie = new Movie();
        assertThat(movie.average()).isEqualTo(0);
    }

    @DisplayName("점수 1을 주고 평점을 구하면 1")
    @Test
    void should_return_1_when_was_rated() throws Exception {
        Movie movie = new Movie();
        movie.rate(1);
        assertThat(movie.average()).isEqualTo(1);

    }
}

package org.study.tddpasswordchecker.practice0531.recentlyusedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RecentlyUsedListTest {

    private RecentlyUsedList recentlyUsedList;

    @BeforeEach
    void setUp() {
        recentlyUsedList = new RecentlyUsedList();
    }

    private void assertList(List<String> expected) {
        List<String> list = recentlyUsedList.getList();
        assertThat(list).isEqualTo(expected);
    }

    @DisplayName("초기에는 비어있는 리스트를 반환")
    @Test
    void testOne() {
        assertList(Collections.emptyList());
    }

    @DisplayName("중복된 요소는 리스트에 넣지 않는다.")
    @Test
    void testTwo() {
        recentlyUsedList.add("str");
        recentlyUsedList.add("str");

        List<String> expected = List.of("str");
        assertList(expected);
    }
}

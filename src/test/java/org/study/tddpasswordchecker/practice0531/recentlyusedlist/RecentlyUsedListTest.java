package org.study.tddpasswordchecker.practice0531.recentlyusedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
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

    private void addMany(String... strings) {
        for (String string : strings) {
            recentlyUsedList.add(string);
        }
    }

    @DisplayName("초기에는 비어있는 리스트를 반환")
    @Test
    void testOne() {
        assertList(Collections.emptyList());
    }

    @DisplayName("중복된 요소는 리스트에 넣지 않는다.")
    @Test
    void testTwo() {
        addMany("str", "str");
        List<String> expected = List.of("str");
        assertList(expected);
    }

    @DisplayName("최근에 넣었던 요소가 가장 먼저 나온다.")
    @Test
    void testThree() {
        addMany("aaa", "bbb");
        List<String> expected = List.of("bbb", "aaa");
        assertList(expected);
    }

    @DisplayName("최근에 넣었던 요소가 가장 먼저 나온다. - 2")
    @Test
    void testFour() {
        addMany("aaa", "bbb", "ccc");
        List<String> expected = List.of("ccc", "bbb", "aaa");
        assertList(expected);
    }


}

package org.study.tddpasswordchecker.practice0531.recentlyusedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class RecentlyUsedListTest {

    @DisplayName("초기에는 비어있는 리스트를 반환")
    @Test
    void testOne() {
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        List<String> list = recentlyUsedList.getList();
        List<String> expected = Collections.emptyList();
        Assertions.assertThat(list).isEqualTo(expected);
    }
}

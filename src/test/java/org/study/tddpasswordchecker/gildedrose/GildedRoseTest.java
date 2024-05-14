package org.study.tddpasswordchecker.gildedrose;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertThat("fixme").isEqualTo(app.items[0].name);
    }

}

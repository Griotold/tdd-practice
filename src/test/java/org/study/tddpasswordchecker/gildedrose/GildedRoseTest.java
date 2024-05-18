package org.study.tddpasswordchecker.gildedrose;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class GildedRoseTest {
    private Item[] items;
    private GildedRose app;

    private void setup(String name, int sellIn, int quality) {
        items = new Item[] {new Item(name, sellIn, quality)};
        app = new GildedRose(items);
    }

    private int itemSellIn() {
        return app.items[0].sellIn;
    }

    private int itemQuality() {
        return app.items[0].quality;
    }

    @Nested
    @DisplayName("일반 아이템은")
    class StandardItem {
        @DisplayName("하루가 지나면 Quality 와 sellIn 이 1씩 감소한다")
        @Test
        void qualityAndSellInDecrease() throws Exception {
            GildedRoseTest.this.setup("Standard Item", 10, 20);
            app.updateQuality();
            assertThat(itemQuality()).isEqualTo(19);
            assertThat(itemSellIn()).isEqualTo(9);
        }
    }

}

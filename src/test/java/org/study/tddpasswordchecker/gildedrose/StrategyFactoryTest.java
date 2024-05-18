package org.study.tddpasswordchecker.gildedrose;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StrategyFactoryTest {

    StrategyFactory factory;

    @BeforeEach
    void setUp() {
        factory = new StrategyFactory();
    }

    @Test
    @DisplayName("Strategy Factory를 사용하여 생성된 전략이 올바른 클래스인지 테스트한다")
    void testStrategies() {
        HashMap<String, ItemUpdateStrategy> strategies = factory.createStrategies();

        assertThat(strategies.get("Aged Brie")).isInstanceOf(AgedBrieUpdateStrategy.class);
        assertThat(strategies.get("Backstage passes to a TAFKAL80ETC concert")).isInstanceOf(BackstagePassesUpdateStrategy.class);
        assertThat(strategies.get("Sulfuras, Hand of Ragnaros")).isInstanceOf(SulfurasUpdateStrategy.class);
        assertThat(strategies.get("Conjured Mana Cake")).isInstanceOf(ConjuredUpdateStrategy.class);
        assertThat(strategies.get(StrategyFactory.DEFAULT_STRATEGY)).isInstanceOf(StandardItemUpdateStrategy.class);
    }
}
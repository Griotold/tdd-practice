package org.study.tddpasswordchecker.gildedrose;

import java.util.HashMap;

public class GildedRose {
    public static final String DEFAULT_STRATEGY = "default";
    Item[] items;
    HashMap<String, ItemUpdateStrategy> strategies;

    public GildedRose(Item[] items, StrategyFactory strategyFactory) {
        this.items = items;
        this.strategies = strategyFactory.createStrategies();
    }

    public void updateQuality() {
        for (Item item : items) {
            getItemUpdateStrategy(item).update(item);
        }
    }

    private ItemUpdateStrategy getItemUpdateStrategy(Item item) {
        return strategies.getOrDefault(item.name, strategies.get(DEFAULT_STRATEGY));
    }
}

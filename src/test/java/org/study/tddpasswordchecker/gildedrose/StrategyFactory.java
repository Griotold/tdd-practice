package org.study.tddpasswordchecker.gildedrose;

import java.util.HashMap;

public class StrategyFactory {

    public static final String DEFAULT_STRATEGY = "default";

    public HashMap<String, ItemUpdateStrategy> createStrategies() {
        HashMap<String, ItemUpdateStrategy> strategies = new HashMap<>();
        strategies.put("Aged Brie", new AgedBrieUpdateStrategy());
        strategies.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassesUpdateStrategy());
        strategies.put("Sulfuras, Hand of Ragnaros", new SulfurasUpdateStrategy());
        strategies.put("Conjured Mana Cake", new ConjuredUpdateStrategy());
        strategies.put(DEFAULT_STRATEGY, new StandardItemUpdateStrategy());
        return strategies;
    }
}

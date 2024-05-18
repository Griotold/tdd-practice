package org.study.tddpasswordchecker.before0518.gildedrose;

public class StandardItemUpdateStrategy extends AbstractItemUpdateStrategy {
    @Override
    public void update(Item item) {
        decrementSellIn(item);
        decrementQuality(item);

        if (item.sellIn < 0) {
            decrementQuality(item);
        }
    }
}

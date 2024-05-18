package org.study.tddpasswordchecker.gildedrose;

public abstract class AbstractItemUpdateStrategy implements ItemUpdateStrategy{
    protected static final int MAX_QUALITY = 50;
    protected static final int MIN_QUALITY = 0;

    protected void incrementQualityIfLessThanMax(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
        }
    }

    protected void decrementSellIn(Item item) {
        item.sellIn--;
    }

    protected void decrementQuality(Item item) {
        if (item.quality > MIN_QUALITY) {
            item.quality--;
        }
    }
}

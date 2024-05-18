package org.study.tddpasswordchecker.gildedrose;

public class ConjuredUpdateStrategy extends AbstractItemUpdateStrategy{
    @Override
    public void update(Item item) {
        decrementQuality(item);
        decrementQuality(item);
        decrementSellIn(item);

        if (item.sellIn < 0) {
            decrementQuality(item);
            decrementQuality(item);
        }
    }
}

package gildedRose;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals(AGED_BRIE) || item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT)) {
                decrementSellIn(item);
                if (item.sellIn < 0 || isQualityLessThanFifty(item)) {
                    incrementQuality(item);
                }
            } else {
                if (item.quality > 0) {
                    if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                        decrementSellIn(item);
                        decrementQuality(item);
                        if (item.sellIn < 0) {
                            decrementQuality(item);
                        }
                    }
                } else {
                    item.quality = 0;
                }
            }
        }
    }

    private void decrementSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void decrementQuality(Item item) {
        item.quality = item.quality - 1;
    }

    private void incrementQuality(Item item) {
        item.quality = item.quality + 1;
    }

    private boolean isQualityLessThanFifty(Item item) {
        return item.quality < 50;
    }
}

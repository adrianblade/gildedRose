package gildedRose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    @Test
    public void dexterityVestTest() {
        Item[] items = new Item[]{new Item("+5 Dexterity Vest", 10, 20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(app.items[0], new Item("+5 Dexterity Vest", 9, 19));
    }

    @Test
    public void agedBrieTest() {
        Item[] items = new Item[]{new Item("Aged Brie", 2, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(app.items[0], new Item("Aged Brie", 1, 1));
    }

    @Test
    public void sulfurasWithSellin0Test() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(app.items[0], new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    }

    @Test
    public void sulfurasWithNegativeSellinTest() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(app.items[0], new Item("Sulfuras, Hand of Ragnaros", -1, 80));
    }

    @Test
    public void backstage_15_Test() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(app.items[0], new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21));
    }

    @Test
    public void backstage_10_Test() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(app.items[0], new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50));
    }

    @Test
    public void backstage_5_Test() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(app.items[0], new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50));
    }

    @Test
    public void conjuredTest() {
        Item[] items = new Item[]{new Item("Conjured Mana Cake", 3, 6)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(app.items[0], new Item("Conjured Mana Cake", 2, 5));
    }
}

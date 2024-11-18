package com.Lab3;

class Main {
    Item[] items;

    public Main(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Normal Item")) {
                updateNormalItem(items[i]);
            } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                updateBackstagePass(items[i]);
            } else if (items[i].name.equals("Aged Brie")) {
                updateAgedBrie(items[i]);
            }

        }
    }

    private void updateNormalItem(Item item) {
        if (item.quality > 0) {
            item.quality -= 1;
        }
        item.sellIn -= 1;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 1;
        }
    }

    private void updateBackstagePass(Item item) {
        if (item.sellIn < 11 && item.quality < 50) {
            item.quality += 1;
        }
        if (item.sellIn < 6 && item.quality < 50) {
            item.quality += 1;
        }
        if (item.quality < 50) {
            item.quality += 1;
        }
        item.sellIn -= 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private void updateAgedBrie(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
        }
        item.sellIn -= 1;
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality += 1;
        }
    }
}

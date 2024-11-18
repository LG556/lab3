package com.Lab3;

class Main {
    Item[] items;

    public Main(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Normal Item") ) {
                if (items[i].quality > 0) {
                    items[i].quality -= 1;
                }
            }
            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].sellIn < 11) {
                    items[i].quality += 1;
                }
                if (items[i].sellIn < 6) {
                    items[i].quality += 1;
                }
            }



            if (!items[i].name.equals("Normal Item")) {
                if (items[i].quality < 50) {
                    items[i].quality += 1;
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn -= 1;
            }

            if (items[i].sellIn < 0) {
                if (items[i].name.equals("Aged Brie")) {
                    if (items[i].quality < 50) {
                        items[i].quality += 1;
                    }
                }
                if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    items[i].quality = 0;
                }


                if (items[i].name.equals("Normal Item")) {
                    if (items[i].quality > 0 ) {
                        items[i].quality -= 1;
                    }
                }
            }
        }
    }
}
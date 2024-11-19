package com.Lab3;

// Базовий клас
abstract class Item {
    String name;
    int sellIn;
    int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public abstract void update();
}

class NormalItem extends Item {
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        if (quality > 0) {
            quality -= 1;
        }
        sellIn -= 1;
        if (sellIn < 0 && quality > 0) {
            quality -= 1;
        }
    }
}

class AgedBrie extends Item {
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        if (quality < 50) {
            quality += 1;
        }
        sellIn -= 1;
        if (sellIn < 0 && quality < 50) {
            quality += 1;
        }
    }
}

class BackstagePass extends Item {
    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        if (sellIn < 11 && quality < 50) {
            quality += 1;
        }
        if (sellIn < 6 && quality < 50) {
            quality += 1;
        }
        if (quality < 50) {
            quality += 1;
        }
        sellIn -= 1;
        if (sellIn < 0) {
            quality = 0;
        }
    }
}
class Sulfuras_Hand_of_Ragnaros extends Item {
    public Sulfuras_Hand_of_Ragnaros(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        // Sulfuras не змінює свої властивості
    }
}

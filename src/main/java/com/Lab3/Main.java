package com.Lab3;

class Main {
    Item[] items;

    public Main(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.update();
        }
    }
}
package com.Lab3;

public class Test {
    public static void main(String[] args) {
        // Створюємо кілька об'єктів Item
        Item[] items = new Item[] {
                new Item("Aged Brie", 10, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Normal Item", 15, 10)
        };

        // Створюємо об'єкт класу Main і передаємо йому масив items
        Main main = new Main(items);

        // Виводимо початковий стан об'єктів
        System.out.println("Before updating quality:");
        for (Item item : items) {
            System.out.println(item);
        }

        // Оновлюємо якість та sellIn
        main.updateQuality();

        // Виводимо стан після оновлення
        System.out.println("\nAfter updating quality:");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}

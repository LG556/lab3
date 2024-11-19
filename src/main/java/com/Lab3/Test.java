package com.Lab3;

public class Test {
    public static void main(String[] args) {
        // Створюємо кілька об'єктів різних типів
        Item[] items = new Item[] {
                new AgedBrie("Aged Brie", 10, 20),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 30),
                new Sulfuras_Hand_of_Ragnaros("Sulfuras, Hand of Ragnaros", 0, 80),
                new NormalItem("Normal Item", 15, 10),
                new NormalItem("Normal Item", 3, 6)  // Додатковий звичайний предмет для тестування
        };

        // Запускаємо тест на 10 днів
        TestRunner testRunner = new TestRunner(items);
        String actualOutput = testRunner.runTestFor10Days();

        // Отримуємо очікуваний результат
        ExpOutput expected = new ExpOutput();
        String expectedOutput = expected.getExpText();

        // Порівнюємо результати
        TestComparator comparator = new TestComparator();
        comparator.compareResults(actualOutput, expectedOutput);
    }
}

class TestComparator {
    public void compareResults(String actualOutput, String expectedOutput) {
        if (actualOutput.equals(expectedOutput)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");

        }
    }
}




package com.Lab3;

class TestRunner {
    private Item[] items;

    public TestRunner(Item[] items) {
        this.items = items;
    }

    public String runTestFor10Days() {
        Main main = new Main(items);  // Створюємо об'єкт класу Main
        StringBuilder output = new StringBuilder();

        // Цикл для тестування протягом 10 днів
        for (int day = 0; day < 10; day++) {
            output.append("Day ").append(day).append(":\n");
            for (Item item : items) {
                output.append(item).append("\n");
            }
            output.append("\n");

            // Оновлюємо якість предметів
            main.updateQuality();
        }
        return output.toString();  // Повертаємо результат тесту
    }
}

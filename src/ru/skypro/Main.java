package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        // Дополнительные задачи
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание 2");
        int firstFriday = 1;
        for (; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int year = 2022;
        int startYear = year - 200;
        int endYear = year + 100;
        for (int i = startYear; i <= endYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ": ");
            }
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int first = 0;
        int second = 1;
        int count = 10; // Количество чисел на вывод

        System.out.print(first + ", " + second);
        for (int i = 3; i <= count; i++) {
            int nextFib = first + second;
            System.out.print(", " + nextFib);
            first = second;
            second = nextFib;
        }
        System.out.println();
    }
}
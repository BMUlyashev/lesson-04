package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        for (;firstFriday <= 31; firstFriday += 7) {
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
}
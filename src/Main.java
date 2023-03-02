import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача №1");
        checkYear(2024);
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является невисокосным");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача №2");
        printVersion(0, 2021);
    }

    public static void printVersion(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year == currentYear && os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (year <= currentYear && os == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (year == currentYear && os == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача №3");
        int result = checkDeliveryTime(15);
        if (result == -1){
            System.out.println("Доставки нет");
        }else {
            System.out.println("Доставка займет дней: " + result);
        }
    }
    public static int checkDeliveryTime(int deliveryDistance) {
        if (deliveryDistance > 100) {
            return -1;
        }
        int deliveryTime = 1;
        if (deliveryDistance > 20) {
                deliveryTime++;
            }
        if (deliveryDistance > 60) {
                deliveryTime++;
            }
            return deliveryTime;
    }
}


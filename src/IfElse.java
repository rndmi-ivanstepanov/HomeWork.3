import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("task1: ");
        int age = 12;

        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Ты пока еще не достиг совершеннолетия");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("task2: ");
        int temp = 12;

        if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("task3: ");
        int speed = 59;

        if (speed > 60) {
            System.out.println("Ваша скорость больше 60, придется заплатить штраф");
        } else {
            System.out.println("Ваша скорость меньше 60, можете ездить спокойно");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("task4: ");
        int age = 15;

        if (age >= 2 && age <= 6) {
            System.out.println("Возраст человека равен " + age + ", ему нужно ходить в детский сад");
        }

         else if (age >= 7 && age <= 18) {
            System.out.println("Возраст человека равен " + age + ", ему нужно ходить школу");
        }

        else if (age > 18 && age <= 24) {
            System.out.println("Возраст человека равен " + age + ", его место в университете");
        }

        else {
            System.out.println("Человеку больше 24, ему пора ходить на работу");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("task5: ");
        System.out.println("Enter age of your kid");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age <= 5) {
            System.out.println("I'm sorry, but due to age rules entrance for your kid is prohibited");
        }

        else if (age > 5 && age < 14) {
            System.out.println("Kid can ride only by your side");

        } else {
                System.out.println("Your kid can ride freely");
            }
        System.out.println();
    }

    public static void task6() {
        System.out.println("task6: ");
        System.out.println("Please say to me your boarding number, I will check for free seats");
        Scanner scanner = new Scanner(System.in);
        int boardingNumber = scanner.nextInt();
        int allSeats = 102;
        int sittingSeats = 60;

        if (boardingNumber < 60) {
            System.out.println("You can enter and take the one of " + (sittingSeats - boardingNumber) + " free sitting seats or just stand");
        } else {
            if (boardingNumber < 102 && boardingNumber >= 60) {
                System.out.println("You can enter, but there are no vacant sitting seats, so you must stand on your feet");
            } else {
                System.out.println("I'm sorry, there are no free seats at all. I can give you new boarding number for the next train which will be in half an hour");
            }
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("task4: ");
        int one = 1000;
        int two = 2000;
        int three = 2000;

        if (one > two) {
            if (one > three) {
                System.out.println("Из данных трех чисел большим является: " + one);
            }
        }
        else if (two > three) {
            System.out.println("Из данных трех чисел большим является: " + two);
        }
        else if (three > one) {
            System.out.println("Из данных трех чисел большим является: " + three);
        }

        else System.out.println("Все числа равны");
    }
}

public class Main {
    public static void main(String[] args) {
        /*Задача 1
        С помощью цикла for выведите в консоль все целые числа от 1 до 10.*/
        System.out.println("Task 1");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        /*Задача 2
        С помощью цикла for выведите в консоль все целые числа от 10 до 1.*/
        System.out.println("Task 2");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        /*Задача 3
        Выведите в консоль все четные числа от 0 до 17.*/
        System.out.println("Task 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        /*Задача 4
        Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.*/
        System.out.println("Task 4");
        for (int i = 10; i > -11; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        /*Задача 5
        Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        В консоль результат должен выводиться в формате: «… год является високосным».*/
        System.out.println("Task 5");
        int begin = 1903;
        int end = 2098;
        for (int i = begin; i <= end; i++) {
            if (i % 100 == 0 && i % 400 != 0)
                continue;
            if (i % 4 == 0)
                System.out.println(i + " год является високосным");
        }
        System.out.println();

        /*Задача 6
        Напишите программу, которая выводит в консоль последовательность чисел:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98*/
        System.out.println("Task 6");
        for (int i = 7; i < 100; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        /*Задача 7
        Напишите программу, которая выводит в консоль последовательность чисел:
        1 2 4 8 16 32 64 128 256 512  */
        System.out.println("Task 7");
        for (int i = 1; i < 1000; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        /*Задача 8
        Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете
        откладывать по 29 000 рублей «в банку».
        Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей». */
        System.out.println("Task 8");
        int money = 0;
        for (int i = 0; i < 12; i++) {
            money = money + 29000;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + money + " рублей");
        }
        System.out.println();


        /*Задача 9
        Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.
        Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей». */
        System.out.println("Task 9");
        money = 0;
        for (int i = 0; i < 12; i++) {
            money = money + money / 100 + 29000;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + money + " рублей");
        }
        System.out.println();

        /*  Задача 10
        Напишите программу, которая выводит в консоль таблицу умножения на 2:
        2*1=2
        2*2=4
        2*3=6
        2*4=8
        2*5=10
        2*6=12
        2*7=14
        2*8=16
        2*9=18
        2*10=20 */
        System.out.println("Task 10");
        int j = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(j + "*" + i + "=" + (i * j));
        }

    }
}
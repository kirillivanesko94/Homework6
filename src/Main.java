public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    private static void task10() {
        System.out.println("Задача №10");
        int number = 2;
        int total3 = 0;
        for (int m = 1 ; m <= 10; m++){
            total3 = number * m;
            System.out.println(number + " * " + m + " = " + total3);
        }
    }

    private static void task9() {
        System.out.println("Задача №9");
        int salary1 = 29000;
        int total1 = 0;
        for (int v = 0; v < 12; v++) {
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц - " + v + " сумма накоплений равна " + total1 + " рублей");
        }
    }

    private static void task8() {
        System.out.println("Задача №8");
        int salary = 29000;
        int total = 0;
        for (int y = 0; y <= 12; y++){
            total += salary;
            System.out.println("Месяц - " + y + " сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task7() {
        System.out.println("Задача №7");
        for (int x = 1; x <= 512; x *= 2){
            System.out.println(x);
        }
    }

    private static void task6() {
        System.out.println("Задача №6");
        for (int t = 7; t <= 98; t += 7){
            System.out.println(t);
        }
    }

    private static void task5() {
        System.out.println("Задача №5");
        for (int r = 1904; r <= 2096; r += 4) {
            System.out.println(r + " год является високосным. ");
        }
    }

    private static void task4() {
        System.out.println("Задача №4");
        for (int a = 10; a >= -10; a--) {
            System.out.println(a);
        }
    }

    private static void task3() {
        System.out.println("Задача №3");
        for (int c = 0; c <= 17; c += 2) {
            System.out.println(c);
        }
    }

    private static void task2() {
        System.out.println("Задача №2");

        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }
    }

    private static void task1() {
        System.out.println("Задача №1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
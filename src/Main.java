public class Main {
    public static void main(String[] args) {
        // Task 1
        {
            System.out.println("Task 1");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            System.out.println();
        }
        // Task 2
        {
            System.out.println("Task2");
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
            System.out.println();
        }
        // Task 3
        {
            System.out.println("Task 3");
            for (int i = 0; i <= 17; i = i + 2) {
                System.out.println(i);
            }
            System.out.println();
        }
        // Task 4
        {
            System.out.println("Task 4");
            for (int i = 10; i >= -10; i--) {
                System.out.println(i);
            }
            System.out.println();

        }
        // Task 5
        {
            System.out.println("Task 5");
            for (int i = 1904; i <= 2096; i = i + 4) {
                System.out.println(i + " Год является високосным");
            }
            System.out.println();
        }
        // Task 6
        {
            System.out.println("Task 6");
            for (int i = 7; i <= 98; i += 7) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // Task 7
        {
            System.out.println("Task 7");
            for (int i = 1; i <= 512; i *= 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // Task 8
        {
            System.out.println("Task 8");
            int accumulation = 29_000;
            int total = 0;
            for (int i = 1; i <= 12; i++) {
                total = total + accumulation;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
            System.out.println();
        }
        // Task 9
        {
            System.out.println("Task 9");
            int accumulation = 29_000;
            int total = 0;
            for (int i = 1; i <= 12; i++) {
                total = (int) (total * 1.01 + accumulation);
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
            System.out.println();
        }
        //Task 10
        {
            System.out.println("Task 10");
            int a = 2;
            int b;
            for (int i = 1; i <= 10; i++) {
                b = a * i;
                System.out.println(a + " * " + i + " = " + b);
            }
        }

    }
}
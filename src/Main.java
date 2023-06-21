// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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

    }

    public static void task1() {
        System.out.println("Задача 1.");
        int monthSum = 15000;
        int goal = 2459000;
        int monthCount = 1;
        int sum = monthSum;

        while (sum < goal) {
            System.out.println("Месяц " + monthCount + " сумма накомпления равна " + sum + " рублей.");
            sum += monthSum;
            monthCount++;
        }
        System.out.println("Итоговая сумма: " + sum + ". Потребовалось месяцев " + monthCount);
    }

    public static void task2() {
        System.out.println("Задача 2.");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;

        }

        System.out.println();

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3.");
        int population = 12000000;
        int birthRate = 17;
        int dead = 8;
        int yearCount = 10;
        int year = 0;

        while (year < yearCount) {
            population += (population / 1000) * (birthRate - dead);
            year++;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4.");
        int goal = 12000000;
        double sum = 15000.00;
        int monthPersent = 7;
        int monthCount = 0;

        while (sum <= goal) {

            sum += sum * monthPersent / 100;
            monthCount++;
            System.out.println("Месяц " + monthCount + " сумма накомпления равна " + sum + " рублей.");
        }

        System.out.println("Итоговая сумма: " + sum + ". Потребовалось месяцев " + monthCount);

    }

    public static void task5() {
        System.out.println("Задача 5.");
        int goal = 12000000;
        double sum = 15000.00;
        int monthPersent = 7;
        int monthCount = 0;

        while (sum <= goal) {

            sum += sum * monthPersent / 100;
            monthCount++;
            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + " сумма накомпления равна " + sum + " рублей.");
            }
        }

            System.out.println("Итоговая сумма: " + sum + ". Потребовалось месяцев " + monthCount);


        }
    public static void task6() {
        System.out.println("Задача 6.");
        double sum = 15000.00;
        int monthPersent = 7;
        int monthCount = 0;
        int yearCount = 9;

        while (monthCount < yearCount * 12) {
            sum += sum * monthPersent / 100;
            monthCount ++;
            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + " сумма накомпления равна " + sum + " рублей.");
            }

            System.out.println("Итоговая сумма: " + sum + ". Потребовалось месяцев " + monthCount);
        }

        }

        public static void task7() {
            System.out.println("Задача 7.");
            int fridayCount = 1;
            int dayInMont = 31;

            while (fridayCount <= dayInMont) {
                System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет%n", fridayCount);
                fridayCount += 7;
            }

        }

        public static void task8() {
            System.out.println("Задача 8.");
int currentYear = 2023;
int yearsBefore = 200;
int yearsAfter = 100;
int cometPeriod = 79;

for (int i = 0; i < currentYear + yearsAfter; i += cometPeriod ) {
    if (i > currentYear - yearsBefore) {
        System.out.println(i);
    }

}


        }
    }
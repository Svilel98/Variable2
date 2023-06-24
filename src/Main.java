
public class Main {
    public Main() {
    }

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
        System.out.println("Задача 1");
        int cherries = 1000000;
        System.out.println("Значение переменной  cherries с типом int равно " + cherries);
        byte tomatos = 1;
        System.out.println("Значение переменной  tomatos с типом byte равно " + tomatos);
        short apples = 200;
        System.out.println("Значение переменной  apples с типом short равно " + apples);
        long seeds = 1000000000L;
        System.out.println("Значение переменной  seeds с типом long равно " + seeds);
        float kilograms = 2.243F;
        System.out.println("Значение переменной  kilograms с типом long равно " + kilograms);
        double procent = 99.99999999;
        System.out.println("Значение переменной  procent с типом long равно " + procent);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float number1 = 27.12F;
        long number2 = 987678965549L;
        float number3 = 2.786F;
        short number4 = 569;
        short number5 = -159;
        short number6 = 27897;
        byte number7 = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte studentLyudmila = 23;
        byte studentAnna = 27;
        byte studentEkaterina = 30;
        byte allStudent = (byte)(studentLyudmila + studentAnna + studentEkaterina);
        short paper = 480;
        short paperOneStudent = (short)(paper / allStudent);
        System.out.println("На каждого ученика рассчитано " + paperOneStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int time = 2;
        byte numberBottle2 = 16;
        byte numberBottleOneMin = (byte) (numberBottle2 / time);
        time = 20;
        int numberBottle = (short) (numberBottleOneMin * time);
        System.out.println("За " + time + " минут машина произвела " +  numberBottle + " штук бутылок");
        time = 60*60*24;
        numberBottle = time * numberBottleOneMin;
        System.out.println("За " + time + " минут машина произвела " +  numberBottle + " штук бутылок");
        time = time * 3;
        numberBottle = time * numberBottleOneMin;
        System.out.println("За " + time + " минут машина произвела " +  numberBottle + " штук бутылок");
        time = time/3*30;
        numberBottle = time * numberBottleOneMin;
        System.out.println("За " + time + " минут машина произвела " +  numberBottle + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte bottleAll = 120;
        byte bottleBrown = 4;
        byte bottleWhite = 2;
        byte bottleOnClass = (byte)(bottleBrown + bottleWhite);
        byte classAll = (byte)(bottleAll / bottleOnClass);
        byte bottleAllBrown = (byte)(classAll * bottleBrown);
        byte bottleAllWhite = (byte)(classAll * bottleWhite);
        System.out.println("В школе, где " + classAll + "  классов, нужно " + bottleAllWhite + " банок белой краски и " + bottleAllBrown + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte amountBanana = 5;
        byte amountMilk = 2;
        byte amountIceCream = 2;
        byte amountEgg = 4;
        byte weightBanana = 80;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEgg = 70;
        short weightBreakfastGrams = (short) ((amountBanana * weightBanana) + (amountMilk * weightMilk) + (amountIceCream * weightIceCream) + (amountEgg * weightEgg));
        float weightBreakfastKilograms = weightBreakfastGrams / 1000f;
        System.out.println("Вес спортивного завтрака " + weightBreakfastGrams + " грамм или " + weightBreakfastKilograms + " килограмм." );
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte weight = 7;
        short weightLossMin = 250;
        short weightLossMax = 500;
        float weightLossMiddle = (weightLossMin + weightLossMax) / 2f;
        short weightKilogramms =(short) (weight * 1000);
        short dayLossMax = (short) (weightKilogramms / weightLossMin);
        short dayLossMin = (short) (weightKilogramms / weightLossMax);
        float dayLossMiddle = weightKilogramms / weightLossMiddle;
        // округлять не стал в большую сторону, так как не проходили и незнаю как)
        System.out.println("Потребуется для похудения максимум " + dayLossMax + " дней, минимум потребуется " + dayLossMin + " дней, в среднем потребуется " + dayLossMiddle + " дней.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int salaryMonthMasha = 67760;
        int salaryMonthDenis = 83690;
        int salaryMonthKristina = 76230;
        byte indexSalary = 10;
        int oldSalaryYearMasha = salaryMonthMasha * 12;
        int oldSalaryYearDenis = salaryMonthDenis * 12;
        int oldSalaryYearKristina = salaryMonthKristina * 12;
        int newSalaryMonthMasha = salaryMonthMasha + salaryMonthMasha / 100 * indexSalary;
        int newSalaryMonthDenis = salaryMonthDenis + salaryMonthDenis / 100 * indexSalary;
        int newSalaryMonthKristina = salaryMonthKristina + salaryMonthKristina / 100 * indexSalary;
        int newSalaryYearMasha = newSalaryMonthMasha * 12;
        int newSalaryYearDenis = newSalaryMonthDenis * 12;
        int newSalaryYearKristina = newSalaryMonthKristina * 12;
        int differenceSalaryMasha = newSalaryYearMasha - oldSalaryYearMasha;
        int differenceSalaryDenis = newSalaryYearDenis - oldSalaryYearDenis;
        int differenceSalaryKristina = newSalaryYearKristina - oldSalaryYearKristina;
        System.out.println("Маша теперь получает " + newSalaryYearMasha + " рублей. Годовой доход вырос на " + differenceSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryYearDenis + " рублей. Годовой доход вырос на " + differenceSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryYearKristina + " рублей. Годовой доход вырос на " + differenceSalaryKristina + " рублей.");
    }
}
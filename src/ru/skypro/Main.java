package ru.skypro;

public class Main {

    public static void main(String[] args) {
      // Задача 1.
       byte a = 5;
       short b = 520;
       int c = 12_200;
       long d = 152562L;
       float e = 25.65f;
       double f = 5.2548745;


        // Задача 2.
        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;
        float totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес 2 бойцов " + totalWeight + " кг.");

        float differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе между бойцами " + differenceWeight + " кг!");

        // Задача 3.
        byte bananas = 5;
        byte bananasWeight = 80;
        int bananasAll = bananas * bananasWeight;
        short milk = 200;
        byte milkWeight = 100;
        int milkAll = milk * milkWeight;
        byte ice = 2;
        byte iceWeight = 100;
        int iceAll = ice * iceWeight;
        byte egg = 4;
        byte eggWeight = 70;
        int eggAll = egg * eggWeight;
        int productsWeightGr = bananasAll + milkAll + iceAll + eggAll;
        System.out.println("Общий вес спортивного коктейля " + productsWeightGr + " грамм!");
        float productsWeightKg = (float) productsWeightGr / 1000.0f;
        System.out.println("Общий вес спорт завтрака " + productsWeightKg + " кг.");

        // Задача 4.
        short minWeightLoss = 250;
        short maxWeightLoss = 500;
        int averageWeightLoss = (minWeightLoss + maxWeightLoss) / 2;
        byte weightKg = 7;
        int weightGr = weightKg * 1000;
        int maxDay = weightGr / minWeightLoss;
        int minDay = weightGr / maxWeightLoss;
        float averageDay = (float) weightGr / averageWeightLoss;
        System.out.println("Потребуется " + maxDay + " дней, если снижать вес каждый день на 250 гр.");
        System.out.println("Потребуется " + minDay + " дней, если снижать вес каждый день на 500 гр.");
        System.out.println("Потребуется " + averageDay + " дней в среднем, чтобы добиться результата!");

        // Задача 5.
        int salaryMasha = 67760;
        float percentage = 1.10f;
        float increaseMasha = (float) salaryMasha * percentage;
        System.out.println("Зарплата после повышения у Маши " + increaseMasha + " рублей.");
        var year = 12;
        float salaryMashaYear = salaryMasha * year;
        float increaseMashaYear = increaseMasha * year;
        float differenceMasha = increaseMashaYear - salaryMashaYear;
        System.out.println("Годовой доход у Маши вырос на " + differenceMasha + " рублей!");

        int salaryDenis = 83690;
        float increaseDenis = (float) salaryDenis * percentage;
        System.out.println("Зарплата после повышения у Дениса " + increaseDenis + " рублей.");
        float salaryDenisYear = salaryDenis * year;
        float increaseDenisYear = increaseDenis * year;
        float differenceDenis = increaseDenisYear - salaryDenisYear;
        System.out.println("Годовой доход у Дениса вырос на " + differenceDenis + " рублей!");

        int salaryKristina = 76230;
        float increaseKristina = (float) salaryKristina * percentage;
        System.out.println("Зарплата после повышения у Кристины " + increaseKristina + " рублей.");
        float salaryKristinaYear = salaryKristina * year;
        float increaseKristinaYear = increaseKristina * year;
        float differenceKristina = increaseKristinaYear - salaryKristinaYear;
        System.out.println("Годовой доход у Кристины вырос на " + differenceKristina + " рублей!");














    }
}

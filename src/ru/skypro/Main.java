package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача 1.
        byte a = 105;
        short b = 520;
        int c = 12200;
        long d = 152562L;
        float e = 45.658f;
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
        var name1 = "Маша"; // зарплата 67 760
        int salaryName1 = 67760;
        //float percentage = 0.10f;
        float percentage = 1.10f;//повышение зарплаты на 10 % от месячной
        //float increaseName1 = (float) salaryName1 * percentage + salaryName1;
        float increaseName1 = (float) salaryName1 * percentage;
        System.out.println("Зарплата после повышения у Маши " + increaseName1 + " рублей.");
        // годовой доход до, после и разница
        var year = 12;
        float salaryName1Year = salaryName1 * year;
        float increaseName1Year = increaseName1 * year;
        float differenceName1 = increaseName1Year - salaryName1Year;
        System.out.println("Годовой доход у Маши вырос на " + differenceName1 + " рублей!");
        //System.out.println(increaseName1Year + " and " + salaryName1Year);

        var name2 = "Денис"; // зарплата 83 690
        int salaryName2 = 83690;
        var name3 = "Кристина"; // зарплата 76 230
        int salaryName3 = 76230;
        //float percentage = 0.10f; //повышение зарплаты на 10 % от месячной, рост годового дохода
        //float increaseName1 = (float) salaryName1 * percentage + salaryName1;
        //System.out.println("Зарплата после повышения у Маши " + increaseName1 + " рублей.");












    }
}

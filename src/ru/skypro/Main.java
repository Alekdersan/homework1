package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double result;
        byte a = 12;
        byte b = 27;
        short c = 44;
        byte d = 15;
        byte e = 9;
        result = a * (b + (c - d * e));

        System.out.println(result);
        System.out.println(Math.abs(result));
        System.out.println(-Math.abs(result));

        // задача 7
        byte x = 5;
        byte y = 7;
        int resultX = x + y - x;
        int resultY = y * x / y;
        System.out.println("a = " + resultX);
        System.out.println("b = " + resultY);

        // задача 8
        int numA = 681;// заданное число а
        int middle = numA / 10 % 10;
        System.out.println("b = " + middle);

    }
}

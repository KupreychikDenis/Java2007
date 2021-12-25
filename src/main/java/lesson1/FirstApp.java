package lesson1;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_zh_TW;

public class FirstApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {

        int a = 5, b = 10, sum = a + b;

        if (sum >= 0) {
            System.out.print("Сумма положительная");
        } else {
            System.out.print("Сумма отрицаткльная");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0){
            System.out.println("Красный");
        } else if (0 < value && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        int a = 2, b = 5;
        if (a >= b){
            System.out.println(a >= b);
        } else {
            System.out.println("a < b");
        }
}
}






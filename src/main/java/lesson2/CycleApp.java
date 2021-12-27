package lesson2;

public class CycleApp {

    public static void main(String[] args) {
        printWords();
    }public static void printWords(){
            System.out.println("printWords");
        }



    public static boolean sumWithin10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (10 <= sum && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.print("Положительное число");
        } else {System.out.print("Отрицательное число");
        }
    }
    public static boolean isNegative (int x){
        if (x < 0 ){
            return true;
        } else {
            return false;
        }
    }
    public static void printWordNTimes (String word, int times){
        for (int i = 0; i < times; i++){
            System.out.print(word);
        }

    }
    public static boolean IfYearIsLeap (int Year){
        if (Year % 4 == 0 && (Year % 400 == 0 || Year % 100 != 0)){
            return true;
        } else {
            return false;
        }

    }
}

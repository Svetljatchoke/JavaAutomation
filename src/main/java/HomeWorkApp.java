public class HomeWorkApp {

    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign(){
        int a = -23;
        int b = -32;
        if ((a+b) >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    static void printColor(){
        int value = 54;
        if (value <= 0) System.out.println("Красный");
            else if (value <= 100) System.out.println("Желтый");
                else System.out.println("Зеленый");


    }

    static void  compareNumbers(){
        int a = -3;
        int b = 3;
        if (a >= b) System.out.println("a >= b");
            else System.out.println("a < b");
    }

    public static void main (String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
}

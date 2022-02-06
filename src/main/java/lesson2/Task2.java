package lesson2;

public class Task2 { //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
                // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void signNumber(int number){
        if (number < 0) System.out.println("Negative number");
        else System.out.println("Positive number");
    }
}

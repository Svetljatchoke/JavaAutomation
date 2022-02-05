package lesson2;

public class Task2 {
    public static void signNumber(int number){ //Написать метод, которому в качестве параметра передается целое число,
                                            // метод должен напечатать в консоль, положительное ли число передали или
                                            // отрицательное. Замечание: ноль считаем положительным числом.
        if (number >= 0) System.out.println("Положительное число");
            else System.out.println("Отрицательное число");
    }
}

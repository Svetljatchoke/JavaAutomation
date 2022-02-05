package lesson2;

public class Task4 {
    public static void stringPrint(String str, int amount){ //Написать метод, которому в качестве аргументов передается
                                                            // строка и число, метод должен отпечатать в консоль указанную
                                                            // строку, указанное количество раз
        for (int i = 0; i < amount; i++) System.out.println(str);
    }

    public static boolean leapYear(int year){  //Написать метод, который определяет, является ли год високосным,
                                                // и возвращает boolean (високосный - true, не високосный - false).
                                                // Каждый 4-й год является високосным, кроме каждого 100-го, при этом
                                                // каждый 400-й – високосный.
        if ((year % 4 == 0)&(year % 100 !=0)|(year % 400 == 0)) return true;
            else return false;
    }
}

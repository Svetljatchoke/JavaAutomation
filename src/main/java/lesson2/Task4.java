package lesson2;

public class Task4 {
    public static void printString(String str, int amount){ //Написать метод, которому в качестве аргументов передается
                                                // строка и число, метод должен отпечатать в консоль указанную строку,
                                                            // указанное количество раз;
        int i = 1;
        while (i <= amount){
            System.out.println(str);
            i++;
        }
    }
    public static boolean leapYear(int year){ //Написать метод, который определяет, является ли год високосным, и
                                            // возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год
                                            // является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    if ((year % 4 == 0)&&(year % 100 != 0)||(year % 400 ==0)) return true;
    else return false;
    }
}

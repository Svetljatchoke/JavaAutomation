package lesson2;

public class Task3 { //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
            // если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.
    public static boolean signNumber(int number){
        if (number < 0) return true;
        else return false;
    }
}

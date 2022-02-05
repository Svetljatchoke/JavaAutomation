package lesson2;

public class Task3 {
    public static boolean signNumber(int number){ //Написать метод, которому в качестве параметра передается целое число.
                                                    // Метод должен вернуть true, если число отрицательное,
                                            // и вернуть false если положительное. Замечание: ноль считаем положительным числом.
        if (number >= 0) return false;
            else return true;
    }
}

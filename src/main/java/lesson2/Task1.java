package lesson2;

public class Task1 { //  Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в
                // пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean inInterval(int a, int b){
        if ((a+b >= 10)&&(a+b <= 20)) return true;
        else return false;
    }
}

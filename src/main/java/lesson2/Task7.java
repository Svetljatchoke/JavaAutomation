package lesson2;

public class Task7 {
    public static void lessThanSix(){ //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и
                                        // числа меньшие 6 умножить на 2;
        int[] array = new int[] {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6) array[i] *= 2;
        }
    }
}

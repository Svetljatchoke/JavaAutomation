package lesson2;

public class Task5 { //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
                        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void zerosAndOnes(){
        int[] array = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
        }
    }
}

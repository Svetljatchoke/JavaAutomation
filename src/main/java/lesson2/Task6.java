package lesson2;

public class Task6 {
    public static void arrayHundredElements (){ //Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
                                                // его значениями 1 2 3 4 5 6 7 8 … 100
        int[] array = new int[100];
        int element = 1;
        for (int i = 0; i < array.length; i++){
            array[i] = element;
            element++;
        }
    }
}

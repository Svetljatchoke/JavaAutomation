package lesson2;

public class Task6 { //Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями
                        // 1 2 3 4 5 6 7 8 … 100
    public static void arrayHundredElements(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) array[i] = i+1;
    }
}

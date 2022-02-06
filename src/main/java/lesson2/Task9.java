package lesson2;

public class Task9 {
    public static int[] array(int len, int initialValue){ //Написать метод, принимающий на вход два аргумента: len и initialValue,
                            // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
    int[] array = new int[len];
    for (int i = 0; i < array.length; i++) array[i] = initialValue;
    return array;
    }

    public static void moveElements(int n){ //Написать метод, которому на вход подается одномерный массив и число n
                                // (может быть положительным, или отрицательным), при этом метод должен сместить все
                                    // элементы массива на n позиций. Элементы смещаются циклично.
        int[] array = new int[] {1, 2, 3, 4, 5, 6};
        int counter = 1;
        int temp;
        while (counter <= Math.abs(n)){
            if (n > 0){
                temp = array[array.length-1];
                for (int i = array.length-1; i > 0; i--) array[i] = array[i-1];
                array[0] = temp;
            }
            else {
                temp = array[0];
                for (int i = 0; i < array.length-1; i++) array[i] = array[i+1];
                array[array.length-1] = temp;
            }
            counter++;
        }
    }
}

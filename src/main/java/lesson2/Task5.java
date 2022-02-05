package lesson2;


public class Task5 {
    public static void changeNumber(){ //Задать целочисленный массив, состоящий из элементов
                                       // 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
                                       // С помощью цикла и условия заменить 0 на 1, 1 на 0
        int[] zerosAndOnes = new int[] {0,0,0,0,1,0,1,0,1,0};
        for (int i = 0; i < zerosAndOnes.length; i++){
            if (zerosAndOnes[i] == 0) zerosAndOnes[i] = 1;
            else zerosAndOnes[i] = 0;
        }
        }

}

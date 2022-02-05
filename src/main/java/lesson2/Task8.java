package lesson2;

public class Task8 {
    public static void diagonalMatrix(){ //Создать квадратный двумерный целочисленный массив (количество строк и столбцов
                                        // одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (i == j) matrix[i][j] = 1;
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
               if (i + j == matrix.length - 1) matrix[i][j] = 1;
            }
        }
    }
}

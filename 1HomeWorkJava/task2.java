/*
 * 2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
 * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
 * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */
public class task2 {
  public static void main(String[] args) {
        int rowsColumns = 9;
        int [] arrayUse [] = new int [rowsColumns][rowsColumns];
        for (int i = 0; i < arrayUse.length; i++){
            for (int j = 0; j < arrayUse[i].length; j++) {
                if (i == j || j == arrayUse[i].length-1-i) {
                    arrayUse[i][j] = 1;
                }
                System.out.print(arrayUse[i][j] + " ");
            }
            System.out.print('\n');
        }
  }
}

/*
 * 4.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
 * или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
 * Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 * Примеры: [ 1, 2, 3 ]     при n = 1 (на один вправо) ->   [ 3, 1, 2 ];
 *          [ 3, 5, 6, 1]   при n = -2 (на два влево) ->    [ 6, 1, 3, 5 ].
 * При каком n в какую сторону сдвиг можете выбирать сами.
*/
public class task4 {
    public static void main(String[] args) {       
        int size = 17;
        int flag = -2;
        int[] arrayUse = new int[size];
        System.out.print("\nYour generation array is: \n");
        for (int i = 0; i < arrayUse.length; i++) {
            arrayUse[i] = i;
            System.out.print(arrayUse[i] + " ");
        }
        int [] newArray = arrayOffset(arrayUse, flag);
        System.out.print("\nYour array with a shift of " + flag + " steps is: \n");
        for (int i : newArray) {          
              System.out.print(i + " ");          
        }
    }  
    public static int[] arrayOffset(int[] arrayUse, int flag) {

        int flagTrue = 0, temp = 0;

        if (flag < 0) {
            flagTrue = arrayUse.length + flag % arrayUse.length;
        } else {
            flagTrue = flag % arrayUse.length;
        }
        int i = 0;
        int secondFlag = 0;
        int firstCompletion = (arrayUse.length - arrayUse.length % flagTrue) / flagTrue - 1;
        while (i < firstCompletion) {
            for (int j = 0; j < flagTrue; j++) {
                temp = arrayUse[j];
                arrayUse[j] = arrayUse[flagTrue + j + i * flagTrue];
                arrayUse[flagTrue + j + i * flagTrue] = temp;
                secondFlag = flagTrue + j + i * flagTrue + 1;
            }
            i++;
        }
        int index1 = 0, index2 = 0;
        if (arrayUse.length % flagTrue != 0) {
           int j = secondFlag;
            int d = 0;
            while (d < flagTrue) {
                index1 = (j + d) % arrayUse.length;
                index2 = (j + d + arrayUse.length % flagTrue) % arrayUse.length;
                temp = arrayUse[index1];
                arrayUse[index1] = arrayUse[index2];
                arrayUse[index2] = temp;
                d++;
            }
            if (flagTrue % (arrayUse.length % flagTrue) != 0) {
                int left = ++index1;
                index2 = index1 + 1;
                int right = 0;
                int z = 0;
                while (z < flagTrue - arrayUse.length % flagTrue){
                    right = index2;
                    while (right < flagTrue) {
                        temp = arrayUse[left];
                        arrayUse[left] = arrayUse[right];
                        arrayUse[right] = temp;
                        right++;
                    }
                    z++;
                }
            }
        }       
        return arrayUse;
    }
}

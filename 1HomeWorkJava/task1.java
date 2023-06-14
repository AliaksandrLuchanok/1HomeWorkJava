/*
 * 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 */

public class task1 {
  public static void main(String[] args) {
    int size = 15, var = 15;
        int [] arrayUse = new int[size];
        arrayUse[0] = (int) (Math.random()*var);
        int minNumber = arrayUse[0], maxNumber = arrayUse[0];
        System.out.println("Your custom array:");
        for (int i = 1; i < arrayUse.length; i++) {
            arrayUse[i] = (int) (Math.random()*var);
            System.out.print(arrayUse[i] + " ");
            if (maxNumber < arrayUse[i]) { // проверка на максимальное и минимальное число осуществляется при генерации, чтобы экономить ресурсы системы
                maxNumber = arrayUse[i];
            }
            else if(minNumber > arrayUse[i]) {
                minNumber = arrayUse[i];
            }
            }
        System.out.printf("\n%d  - is your minimum number \n%d - is your maximum number", minNumber, maxNumber);
  }
}

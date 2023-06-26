package HomeWork6;

import java.util.ArrayList;

public class ClientCode {
    public static void main(String[] args) {
        int sizeArray = 10;
        /** Создание массива ноутбуков согласно заданному количеству*/
        ArrayList<Laptop> laptopList = new ArrayList<>(sizeArray);
        for (int i = 0; i < sizeArray; i++) {
            laptopList.add(new Laptop());
        }
        /** Вывод на печать сгенерированного массива ноутбуков*/
        for (int i = 0; i < sizeArray; i++) {
            System.out.println(laptopList.get(i));
        }
        /** Вызов интерфейса работы с пользовательским запросом поиска по конкретным позициям */
        WorkArrayLaptop.useSelect(laptopList);
    }
}

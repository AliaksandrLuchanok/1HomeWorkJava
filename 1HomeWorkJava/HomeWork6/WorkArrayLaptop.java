package HomeWork6;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkArrayLaptop {
    /** Интерфейс взаимодействия клиента с сгенерированным массивом ноутбуков*/
    public static void useSelect (ArrayList<Laptop> laptopList) {
        /** Переменная считывания строк, вводимых пользователем в терминал*/
        Scanner scanner = new Scanner(System.in);
        /** Переменная, принимающая строку из терминала*/
        String useString;
        /** Мануал пользователя*/
        System.out.println("Выберете параметр поиска ноутбуков по: " + '\n' +
                    "бренду - введите ключевое слово - > \t\t\t brand" + '\n' +
                    "оперативной памяти - введите ключевое слово - >  RAM" + '\n' +
                    "диагонали экрана - введите ключевое слово - > \t diagonal" + '\n' +
                    "цвету ноутбука - введите ключевое слово - > \t color" + '\n' +
                    "стоимости - введите ключевое слово - > \t\t\t cost" );
        /** Создание списка, аккумулирующего перечень ноутбуков из первоначального списка по соответствующим параметрам, заданным пользователем*/
        ArrayList<Laptop> laptopSearch = new ArrayList<>();
        /** Бесконечный цикл считывания данных*/
        while(true) {
            /** Считанные данные из терминала, приведенные к значению без пробелов и к нижнему регистру*/
            useString = scanner.nextLine().replaceAll(" ", "").toLowerCase();
            /** Оператор множественного выбора, в соответствии с интерфейсом*/
            switch (useString) {
                /** В случае соответствия введенной команды текущему значению case, выполняются действия: */
                case "brand":
                    /** Разъяснение пользователю образца ввода искомых параметров*/
                    System.out.println("Введите наименование бренда согласно образцу, например -> Dell");
                    /** Считывание данных, введенных пользователем*/
                    useString = scanner.nextLine().replaceAll(" ", "").toLowerCase();
                    /** Обнуление списка (для того, чтобы при повторном обращении не дозаписывались данные)*/
                    laptopSearch.clear();
                    /** Сравнение конкретного поля списка с искомым значением, введенным пользователем
                     * и присвоение в список в том случае, если конкретный экземпляр соответствует требованиям
                     * */
                    for (int i = 0; i < laptopList.size(); i++) {
                        if (laptopList.get(i).getBrand().toLowerCase().equals(useString)) {
                            laptopSearch.add(laptopList.get(i));
                        }
                    }
                    /** Сообщение пользователю об отсутствии искомых параметров, либо вывод на печать экземпляров,
                     * которые соответствуют искомым требованиям
                     */
                    if (laptopSearch.size() == 0) {
                        System.out.println("Ноутбуков с такими параметрами нет!\n");
                    } else {
                        for (int i = 0; i < laptopSearch.size(); i++) {
                            System.out.println(laptopSearch.get(i));
                        }
                    }
                    /** Обращение к пользователю для продолжения (завершения) работы по поиску данных*/
                    System.out.println("Если удовлетворены результатом поиска, введите -> exit" + "\n" +
                            "Если не удовлетворены, введите параметр поиска");
                    break;
                case "ram":
                    System.out.println("Введите минимальный размер оперативной памяти, например -> 2");
                    useString = scanner.nextLine().replaceAll(" ", "");
                    laptopSearch.clear();
                    Integer valueRam;
                    try {
                        valueRam = Integer.parseInt(useString);
                    } catch (Exception exception) {
                        System.out.println("Ноутбуков с такими параметрами нет!\n" +
                                "Если удовлетворены результатом поиска, введите -> exit" + "\n" +
                                "Если не удовлетворены, введите параметр поиска");
                        break;
                    }
                    for (int i = 0; i < laptopList.size(); i++) {
                        if (valueRam <= laptopList.get(i).getRAM()) {
                            laptopSearch.add(laptopList.get(i));
                        }
                    }
                    if (laptopSearch.size() == 0) {
                        System.out.println("Ноутбуков с такими параметрами нет!\n");
                    } else {
                        for (int i = 0; i < laptopSearch.size(); i++) {
                            System.out.println(laptopSearch.get(i));
                        }
                    }
                    System.out.println("Если удовлетворены результатом поиска, введите -> exit" + "\n" +
                            "Если не удовлетворены, введите параметр поиска");
                    break;
                case "diagonal":
                    System.out.println("Введите минимальный размер диагонали экрана, например -> 15");
                    useString = scanner.nextLine().replaceAll(" ", "");
                    laptopSearch.clear();
                    Double valueDiagonal;
                    try {
                        valueDiagonal = Double.parseDouble(useString);
                    } catch (Exception exception) {
                        System.out.println("Ноутбуков с такими параметрами нет!\n" +
                                "Если удовлетворены результатом поиска, введите -> exit" + "\n" +
                                "Если не удовлетворены, введите параметр поиска");
                        break;
                    }
                    for (int i = 0; i < laptopList.size(); i++) {
                        if (valueDiagonal <= laptopList.get(i).getDiagonal()) {
                            laptopSearch.add(laptopList.get(i));
                        }
                    }
                    if (laptopSearch.size() == 0) {
                        System.out.println("Ноутбуков с такими параметрами нет!\n");
                    } else {
                        for (int i = 0; i < laptopSearch.size(); i++) {
                            System.out.println(laptopSearch.get(i));
                        }
                    }
                    System.out.println("Если удовлетворены результатом поиска, введите -> exit" + "\n" +
                            "Если не удовлетворены, введите параметр поиска");
                    break;
                case "color":
                    System.out.println("Введите искомый цвет ноутбука, например -> green");
                    useString = scanner.nextLine().replaceAll(" ", "").toLowerCase();
                    laptopSearch.clear();
                    for (int i = 0; i < laptopList.size(); i++) {
                        if (laptopList.get(i).getColor().toLowerCase().equals(useString)) {
                            laptopSearch.add(laptopList.get(i));
                        }
                    }
                    if (laptopSearch.size() == 0) {
                        System.out.println("Ноутбуков с такими параметрами нет!\n");
                    } else {
                        for (int i = 0; i < laptopSearch.size(); i++) {
                            System.out.println(laptopSearch.get(i));
                        }
                    }
                    System.out.println("Если удовлетворены результатом поиска, введите -> exit" + "\n" +
                            "Если не удовлетворены, введите параметр поиска: ");
                    break;
                case "cost":
                    System.out.println("Введите минимальную стоимость ноутбука, например -> 40_000");
                    useString = scanner.nextLine().replaceAll(" ", "");
                    laptopSearch.clear();
                    Integer valueCost;
                    try {
                        valueCost = Integer.parseInt(useString);
                    } catch (Exception exception) {
                        System.out.println("Ноутбуков с такими параметрами нет!\n" +
                                "Если удовлетворены результатом поиска, введите -> exit" + "\n" +
                                "Если не удовлетворены, введите параметр поиска");
                        break;
                    }
                    for (int i = 0; i < laptopList.size(); i++) {
                        if (valueCost <= laptopList.get(i).getCost()) {
                            laptopSearch.add(laptopList.get(i));
                        }
                    }
                    if (laptopSearch.size() == 0) {
                        System.out.println("Ноутбуков с такими параметрами нет!\n");
                    } else {
                        for (int i = 0; i < laptopSearch.size(); i++) {
                            System.out.println(laptopSearch.get(i));
                        }
                    }
                    System.out.println("Если удовлетворены результатом поиска, введите -> exit" + "\n" +
                            "Если не удовлетворены, введите параметр поиска");
                    break;
                case "exit":
                    System.out.println("Завершена работа по сортировке ноутбуков");
                    /** Завершение работы со считыванием данных из консоли*/
                    scanner.close();
                    return;
                default:
                    System.out.println("Выбрана неверная команда, повторите...");
                    break;
            }
        }
    }
}

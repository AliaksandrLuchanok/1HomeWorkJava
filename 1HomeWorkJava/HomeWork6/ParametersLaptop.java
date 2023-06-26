package HomeWork6;
public class ParametersLaptop {
    /** Функция, возвращающая значение по рандомному числу, находящемуся в диапазоне размера заданного аргументами массива*/
    public static Object getRandomValue(String nameArray) {
        switch (nameArray) {
            case "brand":
                String[] brand = {"Dell", "HP", "Lenovo", "Apple", "Acer", "MSurface", "Asus"}; // бренд
                return brand[(int) (Math.random() * brand.length)];
            case "RAM":
                int[] RAM = new int[]{2, 4, 6, 8, 16, 32, 64};                                           // оперативная память
                return RAM[(int) (Math.random() * RAM.length)];
            case "diagonal":
                double[] diagonal = new double[]{10.1, 11.6, 12.5, 13.3, 14.1, 15.6, 17.3, 18.4};       // диагональ
                return diagonal[(int) (Math.random() * diagonal.length)];
            case "color":
                String[] color = new String[]{"red", "green", "blue", "gold", "silver", "orange", "black"};      // цвет ноутбука
                return color[(int) (Math.random() * color.length)];
            case "cost":
               int [] cost = new int[]{48_000, 50_000, 55_000, 60_000, 80_000, 100_000,
                       150_000, 200_000, 250_000, 300_000, 330_000}; // стоимость
                return cost[(int) (Math.random() * cost.length)];
        }
        return -1;
    }

}

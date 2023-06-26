package HomeWork6;

import java.util.Random;

/**
 * класс Ноутбук
 */
public class Laptop {
    /**статическое поле для присвоения ID каждому ноутбуку с одинаковыми полями*/
    private static int ID = 0;
    /**поле IDLaptop*/
    private int IDLaptop;
    /**поле brand*/
    private String brand;
    /**поле оперативная память*/
    private int RAM;
    /**поле диагональ*/
    private double diagonal;
    /**поле цвет ноутбука*/
    private String color;
    /**поле стоимость ноутбука*/
    private int cost;

    /**Getter поля бренд*/
    public String getBrand() {
        return brand;
    }
    /**Getter поля оперативная память*/
    public int getRAM() {
        return RAM;
    }
    /**Getter поля диагональ экрана*/
    public double getDiagonal() {
        return diagonal;
    }
    /**Getter поля цвет экрана*/
    public String getColor() {
        return color;
    }
    /**Getter поля стоимость ноутбука*/
    public int getCost() {
        return cost;
    }
    /**Конструктор экземпляра класса Laptop по умолчанию*/
    public Laptop() {
        ID++;
        this.IDLaptop = ID;
        this.brand = (String) ParametersLaptop.getRandomValue("brand");
        this.RAM = (Integer) ParametersLaptop.getRandomValue("RAM");
        this.diagonal = (Double) ParametersLaptop.getRandomValue("diagonal");
        this.color = (String) ParametersLaptop.getRandomValue("color");
        this.cost = (Integer) ParametersLaptop.getRandomValue("cost");
    }
    /**Переопределение метода toString экземпляра класса Laptop*/
    @Override
    public String toString() {
        return "Laptop {" +
                "IDLaptop = " + IDLaptop + '\t' +
                "brand = '" + brand + '\'' + '\t' +
                "RAM = " + RAM + '\t' +
                "diagonal = " + diagonal + '"' + '\t' +
                "color = '" + color + '\'' + '\t' +
                "cost = " + cost +
                '}';
    }
}

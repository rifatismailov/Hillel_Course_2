package homework.five.one;

/**
 * 0.
 * Створити базовий інтерфейс для геометричної фігури, в якому є метод, який повертає площу фігури.
 * Створити 3 класи, які реалізують цей інтерфейс: коло, трикутник, квадрат.
 * Створити масив фігур, і написати метод який виведе сумарну площу всіх фігур у цьому масиві
 */
public class Main {
    public static void main(String[] args) {
        /*
        Geometry[] geometries = new Geometry[]{new Circle(6), new Triangle(5, 6, 7), new Square(5, 7)};
        System.out.println(geometries[0].aRea());
        System.out.println(geometries[1].aRea());
        System.out.println(geometries[2].aRea());
        System.out.println(getArea(geometries));*/
        System.out.println("Area = "+getArea(new Geometry[]{new Circle(6), new Triangle(5, 6, 7), new Square(5, 7)}));
    }

    public static double getArea(Geometry[] geometries) {
        double aRea = 0;
        for (Geometry geometry : geometries) {
            aRea += geometry.aRea();
        }
        return aRea;
    }


}

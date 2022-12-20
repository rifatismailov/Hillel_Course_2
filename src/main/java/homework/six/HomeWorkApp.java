package homework.six;

public class HomeWorkApp {


    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println("check number 10<4+8<20 "+inputNumber(4,8));
        checkNumber(5);
        System.out.println("check number positive=false or negative=true ( 4 is "+checkNumberPN(4)+")");
        showMessage("Hello World",4);
        System.out.println("2000 is "+checkYear(2000));
    }

    private static final String[] fruits = new String[]{"Orange", "Banana", "Apple"};

    private static void printThreeWords() {
        System.out.println("Print fruit");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    /**
     * 4.
     * Створіть метод checkSumSign(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх будь-якими значеннями, якими захочете.
     * Далі метод повинен підсумувати ці змінні, і якщо їх сума більша або дорівнює 0, то вивести в консоль повідомлення "Сума позитивна",
     * інакше - "Сума негативна";
     */
    private static void checkSumSign() {
        int a = 45;
        int b = 32;
        if (a + b >= 0) {
            System.out.println(a+" + "+b+" = sum is positive");
        } else {
            System.out.println(a+" + "+b+" sum is negative");
        }
    }

    /**
     * 4.
     * Створіть метод printColor() у тілі якого задайте int змінну value та ініціалізуйте її будь-яким значенням.
     * Якщо значення менше 0 (0 включно), то в консоль метод повинен вивести повідомлення "Червоний",
     * якщо лежить в межах від 0 (0 виключно) до 100 (100 включно), то "Жовтий", якщо більше 100 (100 виключно) - "Зелений"
     */
    private static void printColor() {
        int value = 22;
        if (value <= 0) {
            System.out.println(value+" Black");
        } else if (value > 0 && value <= 100) {
            System.out.println(value+" Yellow");
        } else {
            System.out.println(value+" Green");
        }
    }

    /**
     * 5.
     * Створіть метод compareNumbers(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх будь-якими значеннями, якими захочете.
     * Якщо a більше або одно b, необхідно вивести в консоль повідомлення “a >= b”, інакше “a < b”;
     */

    private static void compareNumbers() {
        int a = 2;
        int b = 12;
        System.out.println("a = "+a+" b = "+b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");

        }
    }

    /**
     * 6.
     * Написати метод, який приймає на вхід два цілих числа і перевіряє, що їхня сума лежить в межах від 10 до 20 (включно),
     * якщо так – повернути true, інакше – false.
     */
    private static boolean inputNumber(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 7.
     * Написати метод, якому як параметр передається ціле число, метод повинен надрукувати в консоль, чи додатнє число передали або від’ємне.
     * Примітка: нуль вважаємо позитивним числом.
     */
    private static void checkNumber(int value) {
        if (value >= 0) {
            System.out.println(value+" Positive");
        } else {
            System.out.println(value+" Negative");
        }
    }

    /**
     * 8.
     * Написати метод, якому як параметр передається ціле число. Метод повинен повернути true, якщо число є негативним,
     * і повернути false якщо позитивне.
     */
    private static boolean checkNumberPN(int value) {
        if (value < 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 9.
     * Написати метод, якому як аргументи передається рядок і число, метод повинен надрукувати в консоль зазначений рядок,
     * вказану кількість разів;
     */
    private static void showMessage(String message, int value) {
        for (int i = 0; i <= value; i++) {
            System.out.println(i + " Your message " + message);
        }
    }


    /**
     * 10.
     * Написати метод, який визначає, чи є рік високосним, і повертає boolean (високосний – true, не високосний – false).
     * Кожен 4-й рік є високосним, крім кожного 100-го, причому кожен 400-й – високосний.
     */
    private static boolean checkYear(int year) {
        {
            if (year % 4 != 0) {
                return false;
            } else if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}

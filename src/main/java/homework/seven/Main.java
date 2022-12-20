package homework.seven;

public class Main {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        ArrayValueCalculator calculator=new ArrayValueCalculator();
        String[][] array={
                {"1", "9", "567", "1234"},
                {"45", "998", "567", "1234"},
                {"45", "998", "567", "1234"},
                {"45", "998", "567", "456"}
        };
        System.out.println("Answer "+calculator.doCalc(array));
    }
}

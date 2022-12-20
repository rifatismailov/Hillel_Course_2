package homework.seven;

public class Main {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        ArrayValueCalculator calculator=new ArrayValueCalculator();
        String[][] array={
                {"2","5","1","8"},
                {"4","2","5","6"},
                {"3","9","5","34"},
                {"5","5","3","6","8"},
               // {"5","6","7","6"}

        };
        System.out.println("Answer "+calculator.doCalc(array));
    }
}

package homework.seven;

public class ArrayValueCalculator {


    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int sum = 0;

        if (array.length != 4) {
            throw new ArraySizeException("["+array.length+"]");
        } else {
            for (int i = 0; i < 4; i++) {
                if (array[i].length != 4) {
                    throw new ArraySizeException("index "+i+" = "+array[i].length);
                } else {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(array[i][j] + " ");
                        try {
                            sum += Integer.parseInt(array[i][j]);
                        } catch (NumberFormatException e) {
                            throw new ArrayDataException(i, j, array[i][j]);
                        }
                    }
                }
                System.out.println("> " + sum);
            }
        }
        return sum;
    }
}

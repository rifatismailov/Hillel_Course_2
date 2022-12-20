package homework.seven;

public class ArraySizeException extends Exception {
    public ArraySizeException() {
        super("Array size is more");
    }

    public ArraySizeException(String message) {
        super("Array size is " + message + " should be 4 ");
    }
}

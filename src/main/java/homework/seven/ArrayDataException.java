package homework.seven;

public class ArrayDataException extends Exception {
    public ArrayDataException() {
        super("Cannot convert character to number");
    }

    public ArrayDataException(String message) {
        super("Cannot convert character [ " + message + " ] to number");
    }

    public ArrayDataException(int i, String message) {
        super("Cannot convert character [ " + message + " ] to number  of index number [ " + i + " ]");
    }

    public ArrayDataException(int i, int j, String message) {
        super("Cannot convert character [ " + message + " ] to number  of index number [" + i + " ] [ " + j + " ]");
    }
}

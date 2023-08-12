package errorHandler;

/**
 * Created by Alireza on 6/28/2015.
 */

public class ErrorHandler {
    public static boolean hasError = false;

    public static boolean isHasError() {
        return hasError;
    }

    public static void printError(String msg) {
        hasError = true;
        System.out.println(msg);
    }
}

package Log;

public class LogConfig {
    static boolean printLogs = false;

    public static boolean isPrintLogs() {
        return printLogs;
    }

    public static void setPrintLogs(boolean printLogs) {
        LogConfig.printLogs = printLogs;
    }
}

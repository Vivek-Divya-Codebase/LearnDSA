package HashTable;

import java.util.HashMap;

public class LoggerRateLimiter {
    /**
     * Design a logger system that receives a stream of messages along with their timestamps. Each unique message should only be printed{" "} at most every 10 seconds (i.e. a message printed at timestamp t will prevent other identical messages from being printed until timestamp t + 10).
     * All messages will come in chronological order. Several messages may arrive at the same timestamp.
     * Implement the Logger class:
     * Logger() Initializes the logger object.
     * bool shouldPrintMessage(int timestamp, string message){" "} Returns true if the message should be printed in the given timestamp, otherwise returns false.
     * Example 1:
     * Input
     * {"\n"}["Logger", "shouldPrintMessage", "shouldPrintMessage",
     * "shouldPrintMessage", "shouldPrintMessage", "shouldPrintMessage",
     * "shouldPrintMessage"]{"\n"}[[], [1, "foo"], [2, "bar"], [3, "foo"], [8,
     * "bar"], [10, "foo"], [11, "foo"]]{"\n"}
     * Output
     * {"\n"}[null, true, true, false, false, false, true]{"\n"}
     * {"\n"}
     * Explanation
     * {"\n"}Logger logger = new Logger();{"\n"}logger.shouldPrintMessage(1,
     * "foo");{"  "}// return true, next allowed timestamp for "foo" is 1 + 10 = 11
     * {"\n"}logger.shouldPrintMessage(2, "bar");{"  "}// return true, next allowed
     * timestamp for "bar" is 2 + 10 = 12{"\n"}logger.shouldPrintMessage(3, "foo");
     * {"  "}// 3 < 11, return false{"\n"}logger.shouldPrintMessage(8, "bar");
     * {"  "}// 8 < 12, return false{"\n"}logger.shouldPrintMessage(10, "foo");
     * // 10 < 11, return false{"\n"}logger.shouldPrintMessage(11, "foo"); // 11
     * >= 11, return true, next allowed timestamp for "foo" is 11 + 10 = 21
     * {"\n"}
     **/

    public static boolean shouldPrintMessage(int timestamp, String message) {

        HashMap<String, Integer> mp = new HashMap<>();
        if (!mp.containsKey(message)) {
            mp.put(message, timestamp);
            return true;
        }
        if (timestamp-mp.get(message)>=10) {
            mp.put(message, timestamp);
            return true;
        }
        return false;

    }

    public static void main(String args[]) {


    }


}

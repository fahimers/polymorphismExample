package polymorphismexample;

/**
* Specifies an object that can print to a log. This interface
 * does not handle log locations, it is up to the implementing
*  class to decide where the log is.
 */

/**
 * @author Elias
 */
public interface Logger {
    /**
     * The specified message is printed to the log.
     * @param message The message that will be logged.
     */
    void log(String message);
}

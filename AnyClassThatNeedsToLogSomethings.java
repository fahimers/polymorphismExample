package polymorphismexample;

/**
 * A client for the logger. Prints log messages to the
 * specified logger.
 */

/**
 * @author Elias
 */
public class AnyClassThatNeedsToLogSomethings {
    
    private Logger logger;
    public void setLogger(Logger logger){
        this.logger= logger;
    }
    /**
 * Prints to the log. The logged string includes the
 * specified message number.
 *
 * @param msgNo This number is included in the logged
 * string.
 */
    public void anyMethod(int msgNo){
      logger.log("important message number"+msgNo);
  }  
    
}

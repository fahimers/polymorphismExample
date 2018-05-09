package polymorphismexample;



/**
 * A client for the logger. Prints log messages to the
 * specified logger.
 */
public class AnyClassThatNeedsToLogSomething {
    private FileLogger logger;
    
    public void setLogger(FileLogger logger){
        this.logger=logger;
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

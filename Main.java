package polymorphismexample;

/**
 * Contains the main method of the log API client.
 */

/**
 * @author Elias
 */
public class Main {
   /**
 * @param args The program does not take any command line
 * parameters.
 */ 
  public static void main(String[] args){
      AnyClassThatNeedsToLogSomethings client = new AnyClassThatNeedsToLogSomethings();
      
     // client.setLogger(new FileLogger());
      client.anyMethod(1);
      client.anyMethod(2);
      client.anyMethod(3);
      
      client.setLogger(new ConsoleLogger());
      client.anyMethod(4);
      client.anyMethod(5);
      client.anyMethod(6);
  }  
}

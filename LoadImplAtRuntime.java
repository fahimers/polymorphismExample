package polymorphismexample;



/** 
 * Contains a main method of the log API client, which loads
 * new <code>Logger</code> implementations at runtime. 
 * @author Elias
 */
public class LoadImplAtRuntime {
    private int msgNo= 1;
    private AnyClassThatNeedsToLogSomethings client = new AnyClassThatNeedsToLogSomethings();
/**
* @param args Each command line parameter shall be the
* fully qualified class name of a class
* implementing <code>Logger</code>. This
* class will be loaded and used.
*/
    public static void main (String[]args)throws InstantiationException,
            IllegalAccessException, ClassNotFoundException{
        LoadImplAtRuntime main= new LoadImplAtRuntime();
        for(String logger:args){
            main.loadAndUseLogger(logger);
        }
    }
    private void loadAndUseLogger(String logger)throws
            InstantiationException,
            IllegalAccessException,
            ClassNotFoundException{
        Class logClass = Class.forName(logger);
        Logger logInstance = (Logger)logClass.newInstance();
        client.setLogger(logInstance);
        client.anyMethod(msgNo++);
    }
}

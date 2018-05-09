package polymorphismexample;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 /**
* Prints log messages to a file. The log file will be in the
* current directory and will be called log.txt.
 */
public class FileLogger {
    private PrintWriter logStream;

/**
* Creates a new instance and also creates a new log file.
* An existing log file will be deleted.
*/
    public FileLogger() {
        try {
            logStream = new PrintWriter(
                    new FileWriter("log.txt"), true);
        }
        catch(IOException ioe){
            System.out.println("Can not log");
            ioe.printStackTrace();
        }
    }
 /**
29 * Prints the specified string to the log file.
30 *
31 * @param message The string that will be printed to the
32 * log file.
33 */
    public void log(String message)
    {
        logStream.println(message);
    }
 }
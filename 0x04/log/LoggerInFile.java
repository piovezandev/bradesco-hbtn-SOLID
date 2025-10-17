import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerInFile {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("MyLog");

        FileHandler fileHandler;

        try {
            fileHandler = new FileHandler("logs.txt");
            logger.addHandler(fileHandler);

            SimpleFormatter simpleFormatter = new SimpleFormatter();

            fileHandler.setFormatter(simpleFormatter);

            logger.info("teste de Log");

            logger.info("Olá, eu sou o teste da classe principal");
        } catch (SecurityException e) {
            logger.log(Level.SEVERE, e.getMessage());
        } catch (IOException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
    }

}

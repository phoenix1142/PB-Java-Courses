package homework.lesson8;

import javafx.scene.shape.Path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {
        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(new FileInputStream(Paths.get("src/main/java/homework/lesson8/logging.properties").toFile()));
        Logger log = Logger.getLogger(Main.class.getName());

        First first = new First();
        try {
            System.out.println(first.divide(5, 0));
        } catch (ArithmeticException e) {
            log.log(Level.SEVERE, "Exeption: ",e);
            log.log(Level.SEVERE, "На 0 делить нельзя ",e);
        }


        int[] arr = {1, 3, 5};
        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            log.log(Level.INFO, "Exeption: ",e);
            log.log(Level.INFO, "Вы вышли за пределы массива",e);
        }


    }
}

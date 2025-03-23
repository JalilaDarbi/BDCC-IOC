package j.darbi.presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.  forName(daoClassName);
        cDao.newInstance(); //CONSTRUCTEUR sans param

        }
}

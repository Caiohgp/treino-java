package caiohgp.treinojava.classes.IoPackage.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {

        File file = new File("test.txt");

        try (FileWriter fileWriter = new FileWriter(file,true)){
            fileWriter.write("Salve quebrada 2");
            fileWriter.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

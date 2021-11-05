package caiohgp.treinojava.classes.NioPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("renamedFolder/novoArquivo.txt");
        if (!Files.exists(path)){
            Files.createFile(path);
        }
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));

    }
}

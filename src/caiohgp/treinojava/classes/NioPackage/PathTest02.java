package caiohgp.treinojava.classes.NioPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("diretorio");

        if (Files.notExists(pastaPath)){
            Files.createDirectory(pastaPath);
        }

        Path subpastaPath = Paths.get("diretorio/subpasta/subsubpasta");
        Files.createDirectories(subpastaPath);
        Path filePath = Paths.get(subpastaPath.toString(),"file.txt");
        if (Files.notExists(filePath))
            Files.createFile(filePath);

    }
}

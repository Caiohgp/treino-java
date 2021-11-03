package caiohgp.treinojava.classes.IoPackage.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("diretorio");
        boolean isCreated = diretorio.mkdir();
        System.out.println(isCreated);

        File fileDiretorio = new File(diretorio,"diretorioFile.txt");
        boolean fileIsCreated = fileDiretorio.createNewFile();
        System.out.println(fileIsCreated);

        File fileRenamed = new File(diretorio,"renomeado.txt");
        boolean fileIsRenamed = fileDiretorio.renameTo(fileRenamed);
        System.out.println(fileIsRenamed);

        File directoryRenamed = new File("renamedFolder.txt");
        boolean directoryIsRenamed = diretorio.renameTo(directoryRenamed);
        System.out.println(directoryIsRenamed);


    }
}

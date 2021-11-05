package caiohgp.treinojava.classes.NioPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("renamedFolder/novoArquivo2.txt");
        if (!Files.exists(path)){Files.createFile(path);}

        BasicFileAttributes basicFileAttributes = Files.readAttributes(path,BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();

        System.out.println("Creation " + creationTime);
        System.out.println("Acess " + lastAccessTime);
        System.out.println("Modified " + lastModifiedTime);

        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path,BasicFileAttributeView.class);
        FileTime alteredTime = FileTime.fromMillis(System.currentTimeMillis());
        basicFileAttributeView.setTimes(lastModifiedTime,alteredTime,creationTime);

        creationTime = basicFileAttributeView.readAttributes().creationTime();
        lastAccessTime = basicFileAttributeView.readAttributes().lastAccessTime();
        lastModifiedTime = basicFileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("Creation " + creationTime);
        System.out.println("Acess " + lastAccessTime);
        System.out.println("Modified " + lastModifiedTime);

    }
}

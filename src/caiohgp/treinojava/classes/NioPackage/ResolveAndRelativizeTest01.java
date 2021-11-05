package caiohgp.treinojava.classes.NioPackage;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveAndRelativizeTest01 {
    public static void main(String[] args) {

        //Resolve
        Path path1 = Paths.get("/home/caio/documents/dev");
        Path file = Paths.get("test.txt");

        Path resolved =path1.resolve(file);
        System.out.println(resolved);

        //Relativize
        Path path2 = path1;
        Path path3 = Paths.get("/home/caio");
        Path relativized = path2.relativize(path3);
        System.out.println(relativized);

    }
}

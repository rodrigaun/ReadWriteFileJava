package center.rodrigo.main;

import java.io.File;

import center.rodrigo.core.ReadFile;
import center.rodrigo.core.WriteFile;

public class Main {

    public static void main(String[] args) {

        File file = new File("Arquivo.txt");

        ReadFile rf = new ReadFile();
        rf.read(file);

        WriteFile wr = new WriteFile();
        wr.write(file);

    }
}

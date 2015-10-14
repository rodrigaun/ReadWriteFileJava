package center.rodrigo.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFile {

    private BufferedWriter bw;
    private FileWriter fw;

    public void write(File file) {
        
        try {
            // true para acrescentar ao final do arquivo
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);

            bw.newLine();
            bw.write("linha 5");

            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

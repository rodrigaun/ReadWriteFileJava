package center.rodrigo.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {

    private BufferedReader br;
    private FileReader fr;

    public void read(File file) {

        if (!file.exists())
            return;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            while (br.ready()) {
                System.out.println(br.readLine());
            }

            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package points_threee.testAlgorithmReadFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFileBySomeClass {
    private String path = "C:\\Users\\User\\OneDrive\\desktop\\conversation basic (keep practice) .txt";


    public static void main(String[] args) {
        ReadFileBySomeClass readFileBySomeClass = new ReadFileBySomeClass();

    }

    public void getRead() {
        this.read(this.path);
    }

    private void read(String path) {
        Path pathFile = Paths.get(path);
            try {
            Scanner read = new Scanner(pathFile);
            /*read text file using scanner */
                while (read.hasNextLine()) { /* hasNextLine() returns Boolean */
                    /* process each line */
                    System.out.println(read.nextLine());

                }
                read.close();
            } catch (IOException mess) {

            System.out.println("Is has something wrong..."+mess);

            }
    }
}

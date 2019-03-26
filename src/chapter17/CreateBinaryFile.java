package chapter17;
import java.io.*;

public class CreateBinaryFile {

    public static void main(String[] args) throws IOException {
        // Open file / create new file Exercise17_02.dat
        // Output to end of file. If file is empty, will still write to first of file.

        File file = new File("Exercise17_02.dat");
        FileOutputStream fileOut = new FileOutputStream(file , true);

        // Generates random integers between 0-99 and writes to file Exercise17_02.dat
        for(int i = 1; i <= 100; i++ ){
            fileOut.write((int) (100 * Math.random()));
        }
        // Read file and print to console until file stream reads -1 (which signals end of stream) and then print to console success.
        try {
            FileInputStream fileIn = new FileInputStream(file);
            int i;
            while ((i = fileIn.read()) != -1) {
                System.out.print(i + " ");
            }
            System.out.println("\nAll Data Was Read");
        }
        catch(FileNotFoundException ex){
            System.out.print("File not Found");
        }
    }
}

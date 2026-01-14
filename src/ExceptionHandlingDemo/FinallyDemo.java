package ExceptionHandlingDemo;
import java.io.*;

public class FinallyDemo {
    public static void main(String[] args){
        FileReader fileReader = null; // declare outside try
        try {
            fileReader = new FileReader("./Parametrized Constructor Special Case.txt");
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i); // print without extra newline
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}

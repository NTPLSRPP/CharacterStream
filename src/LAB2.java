import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB2 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello World!");
            output.write("Welcome to Java");
            output.close();
        } catch (IOException e) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            String s;
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            int ch;
            while ((ch = input.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}

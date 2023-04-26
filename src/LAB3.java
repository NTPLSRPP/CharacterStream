import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB3 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(50.5);
            output.println(175.0);
            output.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            String s;
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            while ((s = input.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}

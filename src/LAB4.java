import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB4 {
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
            FileReader file = new FileReader("data.txt");
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            System.out.println(name);
            int age = input.nextInt();
            System.out.println(age);
            double weight = input.nextDouble();
            System.out.println(weight);
            double height = input.nextDouble();
            System.out.println(height);

        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}

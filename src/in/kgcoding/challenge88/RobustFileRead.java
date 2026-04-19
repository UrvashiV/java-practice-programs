package in.kgcoding.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileRead {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the file name you want to read: ");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read()) != -1){
                System.out.print((char)read);
            }
        } catch (FileNotFoundException e){
            System.out.printf("%s not found.", fileName);
        }
        catch (IOException e) {
            System.out.printf("Exception Occurred: %s",
                    e.getMessage());
        }
    }

}

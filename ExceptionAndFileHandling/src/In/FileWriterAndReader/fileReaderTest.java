package In.FileWriterAndReader;

import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        file();
    }
    public static void file(){
        String fileName = "C:\\Users\\moham\\Downloads\\Notes\\Websites for movies.txt";

        try( java.io.FileReader reader = new java.io.FileReader(fileName ) ){
            int read = 0 ;
            do {
                read = reader.read();
                System.out.print( (char) read);

            } while (read != -1);

        }catch(IOException exe) {
            System.out.println("Exception Occurred");

        }

    }

    // used filereader inbuild class using object creation, use .read method to print
    //used do while loop for updating read, converted int read into char because text of file
    // is print in char format. here when all file data is printed ".read()" returns -1 which is integer but not char
}

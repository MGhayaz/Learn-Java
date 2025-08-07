package In.FileWriterAndReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        file();
    }
    public static void file(){
       // String fileName = "Hello From The Outside"; new file made here
        String fileName = "C:\\Users\\moham\\Downloads\\Notes\\javatesting.txt"; //  changes in existing file using directory path
        try( FileWriter ManWhoWrite = new FileWriter( fileName ) ){
            ManWhoWrite.write(" i must have call you thousand times"); // add text
            ManWhoWrite.flush(); // request made to update and perform above task

        }catch (IOException exe){
            System.out.println(exe.getMessage());
        }


    }
}

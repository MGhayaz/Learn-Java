package In.Exception;

public class CustomExceptionTest {
    public static void main(String[] args) throws BookNotFoundException{
        teachClass();

    }
    public static void teachClass() throws BookNotFoundException{
        boolean bookFound = false;
        if(!bookFound){
             BookNotFoundException ezw = new BookNotFoundException();
            System.out.println(ezw.getMessage());
            System.out.println(ezw.getBookName());
             throw ezw;
        }
        // created obj of custom exception class
        // overide get.message
        // and threw exception explicitly




    }
}

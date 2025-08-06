package In.Exception;

public class BookNotFoundException extends Exception{





    private String bookName = "Mathew's Mind";

    public BookNotFoundException() {
    }
    // overide get.message of Exception inbuild superclass
    public String getMessage(){
        return "BOOK NAHI HAI, nahi padatoun";
    }

    public String getBookName() {
        return bookName;
    }
}

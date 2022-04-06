package by.TMS_Dudak.HomeTaskOOP.Task4;

public class Books {
   private String bookName;
   private String bookAuther;
   private String bookType;


    public Books(){
    }


    public Books(String bookName, String bookAuther){
        this.bookName = bookName;
        this.bookAuther = bookAuther;
    }

    public Books(String bookType){
        this.bookType = bookType;

    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuther() {
        return bookAuther;
    }

    public void setBookAuther(String bookAuther) {
        this.bookAuther = bookAuther;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

}

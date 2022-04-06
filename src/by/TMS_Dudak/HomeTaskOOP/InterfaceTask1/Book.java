package by.TMS_Dudak.HomeTaskOOP.InterfaceTask1;

public class Book implements Printable{
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void print() {
        System.out.println("Название книги: " + bookName);
    }

    public  static void bookPrint(Printable[] names){
       for(Printable book : names){
           if(book instanceof Book) System.out.println(book);
       }
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Название книги: " +
                "'" + bookName + '\'';
    }
}

package by.TMS_Dudak.HomeTaskOOP.Task4;

import java.util.Random;

public class Reader {
    private String fullName;
    private int id;
    private int faculcy;
    private String birthDay;
    private int number;
    private Books[] booksTaken;

    public Reader(String fullName){
        this.fullName = fullName;
    }

    public Reader(String fullName, int id, int faculcy, String birthDay, int number){
        this.fullName = fullName;
        this.id = id;
        this.faculcy = faculcy;
        this.birthDay = birthDay;
        this.number = number;
    }

    public void setBooksTaken(Books[] booksTaken) {
        this.booksTaken = booksTaken.clone();
    }

    public Books[] getBooksTaken() {
        return booksTaken.clone();
    }

    public void takeBook(int bookCount){
        System.out.println(fullName + " взял " + bookCount + " книг(и)");
    }

    public Books[] takeBook(Books[] book, int quantity){
        System.out.println("\n"+fullName + " взял следующие книги: ");
        int j;
        Books[] getBookTaken = new Books[quantity];
        for(int i = 0; i<quantity ;i++){
            Random random = new Random();
            j = random.nextInt(1, book.length);
            getBookTaken[i] = book[j];
            System.out.println(book[j].getBookName() + " " + book[j].getBookAuther());
        }
        return getBookTaken;

    }

    public String[] takeBook(int quantityType, Books[] type){
        System.out.println("\n"+fullName +" взял книги: ");
        int j;
        String[] bookTypePris = new String[quantityType];
        for (int i = 0; i < quantityType; i++) {
            Random random = new Random();
            j = random.nextInt(1,type.length);
            bookTypePris[i] = String.valueOf(type[j]);
            System.out.println(type[j].getBookType() + " ");
        }
        return bookTypePris;
    }




    public void returnBook(int bookCount){
        System.out.println("\n"+fullName + " вернул " + bookCount + " книг(и)");
    }

    public void returnBook(Books[] book, int quantity){
        System.out.println("\n"+fullName + " вернул следующие книги: ");
        int j;
        Books[] bookArrPris = new Books[quantity];
        for(int i = 0; i<quantity ;i++){
            System.out.println(book[i].getBookName() + " " + book[i].getBookAuther());
        }
    }

    public void returnBook(int quantityType, Books[] type){
        System.out.println("\n"+fullName +" вернул книги: ");
        int j;
        String[] bookTypePris = new String[quantityType];
        for (int i = 0; i < quantityType; i++) {
            Random random = new Random();
            j = random.nextInt(1,type.length);
            bookTypePris[i] = String.valueOf(type[j]);
            System.out.println(type[j].getBookType() + " ");
        }
    }


    public void returnBook(){

    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFaculcy() {
        return faculcy;
    }

    public void setFaculcy(int faculcy) {
        this.faculcy = faculcy;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

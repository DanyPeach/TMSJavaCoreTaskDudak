package by.TMS_Dudak.HomeTaskOOP.InterfaceTask1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Вечера на Хуторе Близ Диканьки");
        Book book2 = new Book("Шоу безликих");
        Book book3 = new Book("Вокзал забытых снов");
        Book book4 = new Book("Хроники Нарнии: Серебряное кресло");
        Magazine magazine1 = new Magazine("TIMES");
        Magazine magazine2 = new Magazine("VOGUE: Korea");
        Magazine magazine3 = new Magazine("NeverTooMuch");

        Printable[] names = {book1, book2, book3, book4, magazine1, magazine2, magazine3};

        for(Printable i : names ){
            i.print();
        }
        System.out.println("\n");
        Magazine.printMagazine(names);
        System.out.println("\n");
        Book.bookPrint(names);
    }
}

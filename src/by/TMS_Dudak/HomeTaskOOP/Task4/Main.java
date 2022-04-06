package by.TMS_Dudak.HomeTaskOOP.Task4;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Daniil");
        Reader reader2 = new Reader("Daniil", 1233, 2, "11.09.2002", 802918629);
        Reader reader3 = new Reader("Vladislav Solovei", 2022109, 2, "Лучший день в году", 802916473);
        Books book1 = new Books("Вечера на хуторе близ Диканьки", "- Гоголь");
        Books book2 = new Books("Орлеан", "- Сия Медисон");
        Books book3 = new Books("Антидемидович", "- Лучший человек");
        Books book4 = new Books("Под белыми крыльями", "- Бонн Д");
        Books book5 = new Books("Шоу Безликих", "Ханна Т");
        Books book6 = new Books("Гарри Поттер и Филосовский камень", "- Дж Роулинг");
        Books type1 = new Books("Художественная литература");
        Books type2 = new Books("Энциклопедия");
        Books type3 = new Books("Учебник");
        Books type4 = new Books("Сборник");



        Books[] booksNameArr = {book1, book2, book3, book4, book5, book6};
        Books[] bookTypeArr = {type1, type2, type3, type4};

        reader1.takeBook(booksNameArr, 3);
        reader1.takeBook(4, bookTypeArr);

        reader3.takeBook(booksNameArr, 2);
        reader3.returnBook(booksNameArr, 2);

        Books[] bookNameRetArr = reader1.takeBook(booksNameArr, 2);
        for(Books i : bookNameRetArr ){
            System.out.println(i.getBookName() + " " + i.getBookName());
        }




    }
}

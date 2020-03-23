package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 464);
        Book principlesPatterns = new Book("Agile software development Principles Patterns and Practices", 557);
        Book headFirstJava = new Book("Head First Java", 433);
        Book effectiveJava = new Book("Effective Java", 521);
        Book[] booksList = new Book[4];
        booksList[0] = cleanCode;
        booksList[1] = principlesPatterns;
        booksList[2] = headFirstJava;
        booksList[3] = effectiveJava;
        for (int index = 0; index < booksList.length; index++) {
            System.out.println(booksList[index].getName() + " - " + booksList[index].getPagesCount());
        }
        booksList[0] = effectiveJava;
        booksList[3] = cleanCode;
        for (int index = 0; index < booksList.length; index++) {
            System.out.println(booksList[index].getName() + " - " + booksList[index].getPagesCount());
        }
        for (int index = 0; index < booksList.length; index++) {
            if (booksList[index].getName().equals("Clean code")) {
                System.out.println(booksList[index].getName() + " - " + booksList[index].getPagesCount());
            }
        }
    }
}

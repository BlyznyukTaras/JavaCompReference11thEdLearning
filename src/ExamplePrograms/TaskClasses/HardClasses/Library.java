package src.ExamplePrograms.TaskClasses.HardClasses;

import java.util.*;

public class Library {
    private String nameOfLibrary;
    private Map<String, List<String>> library;
    public Library() { }
    public Library(String nameOfLibrary) {
        library = new HashMap<>();
        this.nameOfLibrary = nameOfLibrary;
    }
    public Library(Library obj) {
        nameOfLibrary = obj.nameOfLibrary;;
        library = obj.library;
    }
    public void addBook(String author, String nameOfBook) {
        if (!nameOfBook.isEmpty()) {
            List<String> books = library.getOrDefault(author, new ArrayList<>());
            if (!books.contains(nameOfBook)) {
                books.add(nameOfBook);
                library.put(author, books);
                System.out.printf("The book \"%s\" by %s is added to the library\n", nameOfBook, author);
            }
            else {
                System.out.printf("Book by the name \"%s\" is already available in the library\n", nameOfBook);
            }
        }
        else {
            System.out.println("Info isn't fully filled, try again!");
        }
    }
    public void removeBookByName(String nameofBook) {
//        if (!nameofBook.isEmpty()) {
//            for (Map.Entry<String, String> book : library.entrySet()) {
//                if (book.getValue().equals(nameofBook)) {
//                    library.entrySet().remove(book);
//                    System.out.printf("The book by the name \"%s\" was removed from the library\n", nameofBook);
//                    break;
//                }
//            }
//        }
//        else System.out.println();

    }
    public void searchBooksByAuthor(String author) {
        if (library.containsKey(author)) {
            System.out.print("Books written by " + author + ": ");
            List<String> books = library.get(author);
            for (int i = 0; i < books.size(); i++) {
                System.out.print(books.get(i));
                if (i < books.size() - 1) System.out.print(", ");
            }
        }
    }
    public void showBooks() {
        System.out.print("\nAvailable books: ");
        for (Map.Entry<String, List<String>> books : library.entrySet()) {
            String author = books.getKey();
            List<String> bookName = books.getValue();
            for (int i = 0; i < bookName.size(); i++) {
                System.out.printf("%s. %s", author, bookName.get(i));
                symbolOutput(bookName, i, "; ");
            }
        }
    }
    public void symbolOutput(List<String> list, int i, String ch) { if (i < list.size()) System.out.print(ch); }
}
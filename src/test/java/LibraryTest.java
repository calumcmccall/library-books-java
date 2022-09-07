import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void setUp(){
        library = new Library(3);
        book1 = new Book("Baked Treats", "Mary Berry", "Cooking");
        book2 = new Book("Beautiful Code", "Calum McCall", "Computing");
        book3 = new Book("More Beautiful Code", "Calum McCall", "Computing");
        book4 = new Book("Ugly Code", "Calum McCall", "Computing");
        library.addBook(book1);
    }

    @Test
    public void canGetLibraryStock(){
        assertEquals(1, library.getStockCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book2);
        assertEquals(2, library.getStockCount());
    }

    @Test
    public void cantAddIfCapacityMet(){
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.getStockCount());
    }

}

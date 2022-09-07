import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getStockCount(){
        return stock.size();
    }

    public void addBook(Book book){
        boolean libraryStockFull = isStockFull();
        if(libraryStockFull == false) {
            stock.add(book);
        }
    }

    public boolean isStockFull(){
        return (this.stock.size() < this.capacity ? false : true);
    }
}

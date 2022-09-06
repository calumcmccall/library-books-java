import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;

    public Library(){
        this.stock = new ArrayList<Book>();
    }

    public int getStockCount(){
        return stock.size();
    }

    public void addBook(Book book){
        stock.add(book);
    }
}

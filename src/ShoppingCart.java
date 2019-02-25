
import java.util.ArrayList;

public class ShoppingCart {

	ArrayList<Book> arlist = new ArrayList<Book>( );

	public int noOfBooks() {
		// TODO Auto-generated method stub
		return arlist.size();
	}

	public void addBook(String string, int i) {
		// TODO Auto-generated method stub
		Book b= new Book(string,i);
		arlist.add(b);
		
	}

	public int totalprice() {
		// TODO Auto-generated method stub
		int totalPrice=0;
		for (int i=0; i<arlist.size();i++) {
			 totalPrice+=arlist.get(i).price;
		}
		return totalPrice;
	}
}
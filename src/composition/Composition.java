package composition;

import java.util.ArrayList;
import java.util.List;

public class Composition {

	public static void main(String[] args) {

		Books b1=new Books("Rich Dad Poor Dad", "Robert");
		Books b2=new Books("Think And Grow Rich", "Nepolian Hill");
		
		List<Books>books=new ArrayList<Books>();
		books.add(b1);
		books.add(b2);
		
		Library li= new Library(books);
		List<Books> bks = li.getBooks();
		for (Books bo : bks) {
			System.out.println(bo.getBookname()+" the Author is "+bo.getAuthor());
		}
	}

}


import java.util.Comparator;

public class SortbyAuthor implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2)                      {
		String author1=b1.getAuthor();
		String author2=b2.getAuthor();
		int r=author1.compareTo(author2);
		return r;
	}
	

}


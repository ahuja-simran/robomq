import java.util.Comparator;

public class SortbyName implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2)                      {
		String name1=b1.getname();
		String name2=b2.getname();
		int r=name1.compareTo(name2);
		return r;
	}
	
         
}


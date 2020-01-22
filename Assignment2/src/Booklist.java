import java.util.ArrayList;
public class Booklist {
	public static void main(String[] args) {
		ArrayList<Book> books=new ArrayList<Book>();                   
		
		books.add(new Book(1,"Kite Runner", "Durjoy Dutta", "Genius", 5));
		books.add(new Book(2,"Wish", "Paul Coehlo", "Aashirwad", 3));
		books.add(new Book(3,"Alchemist", "Ravinder", "NK", 4));
		books.add(new Book(4,"The Secret", "Simran", "Ncert", 10));           
		books.add(new Book(5,"Kite", "Durjoy", "Gen", 7));
		System.out.println(books);
                    


System.out.println("Sorted By book Name \n");
SortbyName n=new SortbyName();
books.sort(n);
System.out.println(books);


System.out.println("Sorted By Author Name \n");
SortbyAuthor a=new SortbyAuthor();
books.sort(n);
System.out.println(books);

}
}

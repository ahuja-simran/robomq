
public class Book {
	
	private	int membersId;
	private String name;
	private String author;
	private String publisher;
	private int quantity;
	
	public Book(int membersId, String name, String author, String publisher, int quantity)
	{
		this.membersId= membersId;
				this.name= name;
				this.setAuthor(author);
				this.setPublisher(publisher);
				this.setQuantity(quantity);
				
	}
	
	public int getmembersId() {
		return membersId;
	}
	public  void setmembersId(int membersId) {
		this.membersId = membersId;           
	}
	
	
	public String getname() {
		return name;
	}
	public  void setname(String name) {
		this.name = name;           
	}
	
	

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
	                	this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




public String toString()
{
	return "\nMembers Id : "+membersId+" Book Name : "+name+" Author Name : "+author+" Publisher Name : "+publisher+" Quantity : "+quantity+"";
}
}

public class Book {
	String bookName;
	String authorName;
	int pages;
	boolean available;
	
	boolean isAvailable()
	{
		if(available == true)
		{
			System.out.println(bookName + "这本书当前可以借阅");
			return true;
		}
		else
		{
			System.out.println(bookName + "这本书当前不可以借阅");
			return false;
		}
	}
	
	Book(String bookName, String authorName, int pages, boolean available)
	{
		this.bookName = bookName;
		this.authorName = authorName;
		this.pages = pages;
		this.available = available;
	}
	
	public static void main (String args[])
	{
		Book objBook1 = new Book("CoreJava", "Albert", 245, true);
		Book objBook2 = new Book("Thinking in Java", "Btuce", 741, false);
		User objUser = new User();
		objUser.getBookStatus(objBook1);
		objUser.getBookStatus(objBook2);
	}
}
class User {
	void getBookStatus(Book objBook)
	{
		objBook.isAvailable();
	}
}

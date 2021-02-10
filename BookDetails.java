package Num2;
class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return 70;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return "kljsrfg";
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return "Martin Luther";
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return 800;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
class EngineeringBook extends Book{
	private String category;
}
public class BookDetails {

	public static void main(String[] args) {
		Book b=new Book();
		b.getBookNo();
		b.getTitle();
		b.getPrice();
		b.getAuthor();
System.out.println("book no:"+b.getBookNo());
System.out.println("title is"+ b.getTitle());
System.out.println("price is:"+b.getPrice());
System.out.println("Author is:"+b.getAuthor());
	}

}

package day34_encapsulation;

/*
 * TODO
    Book class'� verilmi�tir.
    �ki tane attributes olu�turunuz.
    bookName ve authorName (String ile)
    Book class'�n� kaps�lleyin. (Encapsulate)
    Main class'�n i�ine object  olu�turun ve sonucu yazd�r�n�z.
	"Book name is BOOKNAME and Author is AUTHORNAME"
 */

public class C03_Book {

	private String bookName;
    private String authorName;
    
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}

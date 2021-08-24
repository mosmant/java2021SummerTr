package day34_encapsulation;

/*
 * TODO
    Book class'ý verilmiþtir.
    Ýki tane attributes oluþturunuz.
    bookName ve authorName (String ile)
    Book class'ýný kapsülleyin. (Encapsulate)
    Main class'ýn içine object  oluþturun ve sonucu yazdýrýnýz.
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

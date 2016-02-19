// Referenced Prof Marshall's teams2016
package BookStore;

public class RentBook extends booksuper{

	private String book = "unkown";
	
	private String author;
	
	private int serial;
	
	private int card;
	
	public RentBook(){ // constructor
		
		book = "Peter Pan";
		
		author = "J.M. Barrie";
		
		serial = 2222;  // not used in this subclass
		
		card = 0000000;  // not used in this subclass
	}
	
	@Override		
	
	public String getbook(){
		return (book);
	}

	public String getauthor(){
		return (author);
	}

	public int getserial(){
		return (serial);
	}




}

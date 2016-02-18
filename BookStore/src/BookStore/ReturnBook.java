package BookStore;

public class ReturnBook extends booksuper{

	private String book = "unknown";
	
	private String author;
	
	private int serial;
	
	private int card;
	
	public ReturnBook(){
		
		book = "The Hobbit";
		
		author = "J.R.R. Tolkien";
		
		serial = 4343;
		
		card = 3334444;
		
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

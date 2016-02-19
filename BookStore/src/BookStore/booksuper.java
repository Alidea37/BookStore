// Used Prof Marshall's teams2016 as a reference

package BookStore;

public class booksuper {

	private static final String library = "Carroll College Library"; // remains the same throughout

	private String book;
	
	private String author;
	
	private int serial;
	
	private int card;
	
	public booksuper (){ // constructor
		
		// instances
		book = "unselected";
		
		author = "unknown";
		
		serial = 1122;
		
		card = 1234567;
	}
	
public booksuper(String b, String aut){
	
	book = b;
	author = aut;
	
	serial = 1122; // must be the same number as in the constructor
	card = 1234567;
}

public String getlibrary(){
	
	return (library);
}

public String getauthor(){
	return (author);
}

public String getbook(){
	return (book);
}

public int getserial(){
	return (serial);
}

public int getcard(){
	return (card);
}

public void setserial(int s){		// set the serial
	serial = s;
	return;
}

public void setcard(int c){			// set the card
	card = c;
	return;
}

}

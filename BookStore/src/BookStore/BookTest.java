// referenced Prof Marshall's teams2016
package BookStore;

public class BookTest {

	public static void main(String[] args) {
		
		
		
		booksuper mysuper[] = new booksuper[3];  // instantiates string array of superclass
		for ( int x=0; x<3; x++){
			
			mysuper [x] = new booksuper();
		}
		
		String lib = mysuper[0].getlibrary();
		
		for (int x = 0; x < 1; x++){
			String b = mysuper[x].getbook();
			String aut = mysuper[x].getauthor();
			int s = mysuper[x].getserial();
			int c = mysuper[x].getcard();
			
	System.out.println(lib + ",\n"+ " Author: " + aut + " title: " + b + " serial# " + s + " card id# : " + c);
		}
		
		try{Thread.sleep(1000);}
		catch (Exception e){};
		
		
		RentBook myrentbook[] = new RentBook[3]; // instantiate String array of RentBook subclass
		for (int i=0; i<3; i++){
		
			myrentbook [i] = new RentBook();
		}

	String library = myrentbook[0].getlibrary(); // first item in new array
	
	for (int i = 0; i < 1; i++){			// runs loop once
		String b = myrentbook[i].getbook();
		String aut = myrentbook[i].getauthor();
		int s = myrentbook[i].getserial();
		int c = myrentbook[i].getcard();

		System.out.println("\n" + library + ",\n"+ " Author: " + aut + " title: " + b + " serial# " + s + " card id# : " + c);
	}
		
	try{Thread.sleep(1000);}
	catch (Exception e){};
	
		ReturnBook myreturnbook[] = new ReturnBook[3]; 		// Instantiate string array of subclass ReturnBook
		for (int a=0; a<3; a++){
			
			myreturnbook [a] = new ReturnBook();
		}
			
		String Library = myreturnbook[0].getlibrary();
		
		for (int a=0; a<1; a++){
			String b = myreturnbook[a].getbook();
			String aut = myreturnbook[a].getauthor();
			int s = myreturnbook[a].getserial();
			int c = myreturnbook[a].getcard();
		
			System.out.println("\n" + library + ",\n"+ " Author: " + aut + " title: " + b + " serial# " + s + " card id# : " + c);
		}
		
	
	
			BookStore bookstore = new BookStore(); // create new instance of class BookStore
	
		}
	}
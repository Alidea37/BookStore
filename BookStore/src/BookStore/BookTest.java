package BookStore;

public class BookTest {

	public static void main(String[] args) {
		
		
		RentBook myrentbook[] = new RentBook[3]; // creates an array list to hold variables
		for (int i=0; i<3; i++){
		
			myrentbook [i] = new RentBook();
		}

	String library = myrentbook[0].getlibrary(); // first item in new array
	
	for (int i = 0; i < 1; i++){
		String b = myrentbook[i].getbook();
		String aut = myrentbook[i].getauthor();
		int s = myrentbook[i].getserial();
		int c = myrentbook[i].getcard();

		System.out.println(library + ", Author: " + aut + " title: " + b + " serial# " + s + " card id# : " + c);
	}
		
		ReturnBook myreturnbook[] = new ReturnBook[3];
		for (int a=0; a<3; a++){
			
			myreturnbook [a] = new ReturnBook();
		}
			
		String Library = myreturnbook[0].getlibrary();
		
		for (int a=0; a<1; a++){
			String b = myreturnbook[a].getbook();
			String aut = myreturnbook[a].getauthor();
			int s = myreturnbook[a].getserial();
			int c = myreturnbook[a].getcard();
		
			System.out.println(library + ", Author: " + aut + " title: " + b + " serial# " + s + " card id# : " + c);
		}
		
	
	
	//BookStore bookstore = new BookStore();
	
		}
	}
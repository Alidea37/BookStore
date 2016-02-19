package BookStore;

import java.util.InputMismatchException;
import java.util.Scanner;


public class BookStore {

	
	private static String[] books = {" 1. The Time Machine", " 2. The Three Musketeers", " 3. Hound of Baskerville", " 4. Little Women", " 5. Jurassic Park", " 6. A Light in the Attic", " 7. All Creatures Great and Small"};
	//private double [][] prices = {{7.99, 8.47, 4.75, 9.99, 8.99, 10.00, 11.50}, {10.00, 11.95, 9.00, 15.00, 15.75, 17.00, 18.95}};  // soft cover and hard cover prices
	
	private static int bookselect; // book user selects
	static boolean continueLoop = true;
	
	protected BookStore() { //constructor
	
	
			Scanner myscan = new Scanner(System.in);
			
			try{Thread.sleep(3000);}
			catch (Exception e){};
			
			System.out.println("\nThere is currently a stack of free books at the counter, feel free to take one.");
			
			try{Thread.sleep(3000);}
			catch (Exception e){};
			
			for (int row = 0; row < books.length; row++){
				System.out.println (books [row]);
			}
			
				System.out.print("\nPlease enter the number of the free book you would like to take home: ");
			
		do // divide by zero exception handling on pp 435-436
			{
				try 
				{	
			
			bookselect = myscan.nextInt();
			
			if (bookselect <= 1)		// prevents selections of 0or less from being selected
				System.out.printf("You selected %s", books[0]); 
			else
				if (bookselect == 2)
					System.out.printf("You selected %s", books[1]);
				else
					if (bookselect == 3)
						System.out.printf("You selected %s", books[2]);
						else
							if (bookselect == 4)
								System.out.printf("You selected %s", books[3]);
							else
								if (bookselect == 5)
									System.out.printf("You selected %s", books[4]);
								else
									if (bookselect == 6)
										System.out.printf("You selected %s", books[5]);
										else
											if (bookselect >= 7)
												System.out.printf("You selected %s", books[6]); // >= prevents going over #7
											
											
												
			continueLoop = false; // input successful; end looping
				}
			
				catch (InputMismatchException inputMismatchException)
			
				{
					// if letters or doubles are entered
					
					System.err.printf("%nException: %s%n",
						inputMismatchException);
						myscan.nextLine(); // discard input so user can try again
						System.out.printf("You must enter the book number. Please try again.%n%n");
			}
			
				}
	
			while (continueLoop);
	
			myscan.close();
			
			System.out.println("\nThank you for supporting your local library!");
	}
		
}
			


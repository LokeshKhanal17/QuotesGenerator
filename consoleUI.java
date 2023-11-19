package QuotesGenerator;

import java.util.List;
import java.util.Scanner;

public class consoleUI {
    
    public void displayMenu(){

        System.out.println("Welcome to Quotes Sansar!!!!");
        System.out.println("This is the place where you can change your life....");

    }

    public int getUserChoice(){
        System.out.println("Here you have manny options :\n 1. Add a quote \n 2. Remove a quote \n 3. Get quote for day. \n 4.Search quote by Category\n 5. Get quote by keyword");
        System.out.println("Enter your choice according to number : ");
        Scanner src = new Scanner(System.in);
        int choice = src.nextInt();
        return choice;
    }
//display quotes for all the available quotes.
public void displayQuote(){

    quotesManager manager = new quotesManager();
    List<quotes> allQuotes = manager.returnAllQuotes(); // Assuming this gets the quotes list

    for(quotes quote : allQuotes) {
        System.out.println(quote.getText()); // Assuming getText() retrieves the text of the quote
    }
}

    
}

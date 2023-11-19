package QuotesGenerator;

import java.util.ArrayList;
import java.util.Optional;

import QuotesGenerator.quotes.Category;

public class quotesManager {
    //List to store all the quotes
    ArrayList<quotes> quotesList = new ArrayList();

    // public quotesManager(ArrayList<quotes> quotesList){
    //     this.quotesList = quotesList;
    // }

    public ArrayList<quotes> returnAllQuotes(){
        return this.quotesList;
    }

    //Add a quote to the list :
    public void addQuote(quotes quote){
        //check if quote is null or not
        if(quote != null){
            quotesList.add(quote);
        } 
        else {
            System.out.println("The Object of class quote provided is null.");
        }
        
    }
    //remove quote from the list 
    public void removeQuote(int id){
        if(id >= 0 ){
            Optional<quotes> quotesToRemove = quotesList.stream().filter(quote -> quote.getId() == id ).findFirst();
            quotesToRemove.ifPresent(quote-> quotesList.remove(quote));
        }
    }
    
    //get Random Quote Every 1 Minute and display it to the user
    public Optional<quotes> getRandomQuote(){
        //generate random index.
        if(!quotesList.isEmpty()){
            int randomIndex =(int) Math.random()*quotesList.size();
            return Optional.of(quotesList.get(randomIndex));
        }
        else {
            return Optional.empty();
        }

    }
    //Search by category and display all the possible of quotes for the list based on the category
    public Optional<quotes> searchByCategory(Category category){
        if(category != null){
            Optional<quotes> CategoryResult = quotesList.stream().filter(quote -> quote.getCategory() == category ).findAny();
            return CategoryResult;
        }
        else{
            return Optional.empty();
        }

    }
    
    //Search bye Keyword based on text if it contains that text it will be displayed
    public Optional<quotes> searchByKeyword(String keyword){
        if (isValidText(keyword)) {
            Optional<quotes> foundQuote = quotesList.stream()
                    .filter(quote -> quote.getText().toLowerCase().contains(keyword.toLowerCase()))
                    .findAny();
            return foundQuote;
        } 
        else {
            // Handle invalid keyword (empty or null)
            return Optional.empty();
        }
    }
    
    private boolean isValidText(String text) {
        return text != null && !text.trim().isEmpty();
    }
}

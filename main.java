package QuotesGenerator;

public class main {
    public static void main(String[] args) {
        consoleUI start = new consoleUI();
        start.displayMenu();
        int choice = start.getUserChoice();
        
        switch (choice) {
            case 1:
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.out.println("Thank You!!!!");
            default:
                System.out.println("Please try again!!!!!");
                break;
        }

    }
    
}

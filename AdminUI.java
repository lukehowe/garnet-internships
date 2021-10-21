import java.util.Scanner;

/**
 * @author We Lit Design Company
 */
public class AdminUI {

    private static Scanner scanner;
    private static final String QUESTION = "What would you like to do?\n";
    
    public AdminUI() {
        scanner = new Scanner(System.in);
    }
    
    public static String AdminMenu() {
        String adminMenu = "";
        adminMenu += "\nWelcome Administrator!";
        adminMenu += "--------Menu--------";
        adminMenu += "1. Hide Rating \n2. Remove Internship \n3. Delete Account\n";
        adminMenu += QUESTION;
        return adminMenu;
    }

    public static void AdminMenuChoice() {
        int menuChoice = scanner.nextInt();
        scanner.nextLine();
        if(menuChoice == 1) {
            //HIDE RATING
        } else if(menuChoice == 2) {
            //REMOVE INTERNSHIP
        } else if(menuChoice == 3) {
            //DELETE ACCOUNT
        } else {
            System.out.println("Not a valid option");
            AdminMenuChoice();
        }
    }

}

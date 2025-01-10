package person;

import java.util.Scanner;

public class PersonService {
    
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    private static int printMenu() {
        PersonOperations oprs = new PersonOperations();
        System.out.println("1:Insert 2:Delete 3:Update 4:Search 5:ListALl 6:Exit \t Your Choice: ");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1 : oprs.insertPerson(); break;
            case 2 : oprs.deletePerson(); break;
            case 3 : oprs.updatePerson(); break;
            case 4 : oprs.searchPerson(); break;
            case 5 : oprs.listAllPersons(); break;
            case 6 : System.out.println("End of Program");
            choice = -1; break;
            default: System.out.println("Invalid choice entered");
        }
        return choice;
    }

    private static void startApp() {
        int choice = 0;
        do {
            choice = printMenu();
        }while(choice != -1);
    }

    public static void main(String[] args) {
        startApp();
    }
}

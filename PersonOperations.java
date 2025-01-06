package person;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PersonOperations {
    
    private List <Person> persons;
    private Scanner scanner;
    
    {
        scanner = new Scanner(System.in);
    }

    private void insertPerson() {

    }

    private void deletePerson() {

    }

    private void updatePerson() {

    }

    private void searchPerson() {

    }

    private void listAllPersons() {

    }

    private int printMenu() {
        System.out.println("1:Insert 2:Delete 3:Update 4:Search 5:ListALl 6:Exit \t Your Choice: ");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1 : this.insertPerson(); break;
            case 2 : this.deletePerson(); break;
            case 3 : this.updatePerson(); break;
            case 4 : this.searchPerson(); break;
            case 5 : this.listAllPersons(); break;
            case 6 : System.out.println("End of Program");
            choice = -1; break;
            default: System.out.println("Invalid choice entered");
        }
        return choice;
    }

    private void startApp() {
        int choice = 0;
        do {
            choice = printMenu();
        }while(choice != -1);
    }

    public static void main(String[] args) {
        PersonOperations oprs = new PersonOperations();
        oprs.startApp();
    }
}

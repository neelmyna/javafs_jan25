package person;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PersonOperations {
    private List <Person> persons;
    private Scanner scanner;
    
    {
        scanner = new Scanner(System.in);
        persons = new ArrayList<>();
    }

    private void insertPerson() {
        System.out.print("Enter name of the person: ");
	    String name = scanner.next();
	    System.out.print("Enter gender of the person: ");
	    char gender = scanner.next().charAt(0);
	    Person person = new Person(name, gender);
	    persons.add(person);
    }

    private void deletePerson() {
        if(persons.isEmpty()) {
            System.out.println("There are no persons to delete");
            return;
        }
        System.out.print("Enter Id of the person to delete: ");
        int id = scanner.nextInt();
        for(Person person : persons) {
            if(person.getId() == id) {
                System.out.println("Deleted person is " + person);
                persons.remove(person);
                return;
            }
        }
        System.out.println("Person with id " + id + " not found");
    }

    private void updatePerson() {
        if(persons.isEmpty()) {
            System.out.println("There are no persons to update");
            return;
        }
        System.out.print("Enter Id of the person to update: ");
        int id = scanner.nextInt();
        for(Person person : persons) {
            if(person.getId() == id) {
                System.out.print("Enter new name to be updated: ");
                String name = scanner.next();
                person.setName(name);
                System.out.println("Updated person is " + person);
                return;
            }
        }
        System.out.println("Person with id " + id + " not found");
    }

    private void searchPerson() {
        if(persons.isEmpty()) {
            System.out.println("There are no persons to seacrh");
            return;
        }
        System.out.print("Enter Id of the person to be search: ");
        int id = scanner.nextInt();
        for(Person person : persons) {
            if(person.getId() == id) {
                System.out.println("Name of the person is " + person.getName());
                System.out.println("Gender is " + person.getGender());
                return;
            }
        }
        System.out.println("Person with id " + id + " not found");
    }

    private void listAllPersons() {
        if(persons.isEmpty()) {
            System.out.println("No persons to list");
            return;
        }
        System.out.printf("%-3s %-15s %s\n", "ID", "NAME", "GENDER");	System.out.printf("------------------------------\n");
        for(Person person : persons) {
            System.out.printf("%-3s %-15s %s \n", person.getId(), person.getName(), person.getGender());
            //System.out.println(person);
        }
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

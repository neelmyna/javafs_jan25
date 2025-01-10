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

    private Person readPersonDetails() {
        System.out.print("Enter name of the person: ");
	    String name = scanner.next();
	    System.out.print("Enter gender of the person: ");
	    char gender = scanner.next().charAt(0);
        
        Person person = new Person(name, gender);
        
        return person;
    }

    public void insertPerson() {
	    Person person = readPersonDetails();
	    persons.add(person);
    }

    public void deletePerson() {
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

    public void updatePerson() {
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

    public void searchPerson() {
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

    public void listAllPersons() {
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
}

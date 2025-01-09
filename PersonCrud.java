package person;


import java.util.Scanner;

public class PersonCrud {
	
	private static Scanner scanner;
	
	static {
		scanner = new Scanner(System.in);
	}
	
	public void insertPerson() {
		System.out.println("Row Inserted");
	}

	public void listAllPersons() {
		System.out.println("All Rows listed");
	}

	public void deletePerson() {
		System.out.println("Row deleted");
	}
	
	public void searchPerson() {
		System.out.println("Row searched");
	}
	
	public void updatePerson() {
		System.out.println("Row updated");
	}

	public int printMenu() {
		int choice = 0;
		System.out.print("1:Insert 2:Delete 3:Update 4:Search 5:List 6:Exit \n Your choice: ");
			choice = scanner.nextInt();
			switch(choice) {
				case 1 :  insertPerson(); break;
				case 2 :  this.deletePerson(); break;
				case 3 :  updatePerson(); break;
				case 4 :  searchPerson(); break;
				case 5 :  this.listAllPersons(); break;
				case 6 : System.out.println("End of Program"); choice = -1; break;
                default: System.out.println("Invalid choice enetered");
            }// end of switch
		return choice;
	}
	
	public void startApp() {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			choice = this.printMenu();
		}while(choice != -1);
        scanner.close();
	}
	
	public static void main(String[] args) {
		PersonCrud crud = new PersonCrud();
		crud.startApp();
	}
}


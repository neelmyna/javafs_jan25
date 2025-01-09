package person;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1:Insert 2:Delete 3:Update 4:Search 5:List 6:Exit \n Your choice: ");
			choice = scanner.nextInt();
			switch(choice) {
				case 1 : System.out.println("Insert"); break;
				case 2 : System.out.println("Delete"); break;
				case 3 : System.out.println("Update"); break;
				case 4 : System.out.println("Search"); break;
				case 5 : System.out.println("List"); break;
				case 6 : System.out.println("End of Program"); choice = -1; break;
                default: System.out.println("Invalid choice enetered");
            }// end of switch
		}while(choice != -1);
        scanner.close();
	}// end of main
}